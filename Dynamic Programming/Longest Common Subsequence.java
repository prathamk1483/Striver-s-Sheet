// class Solution {
//     private int helper(String s1,String s2,int i,int j,int[][] dp){
//         if(i <0 || j < 0) return 0;
//         if(dp[i][j] != -1) return dp[i][j];

//         if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = 1+helper(s1,s2,i-1,j-1,dp);
//         return dp[i][j] = Math.max( helper(s1,s2,i-1,j,dp),helper(s1,s2,i,j-1,dp) );
//     }
//     public int longestCommonSubsequence(String text1, String text2) {
//         int dp[][] = new int[text1.length()][text2.length()];
//         for(int i[] :dp) Arrays.fill(i,-1);
//         return helper(text1,text2,text1.length()-1,text2.length()-1,dp);
//     }
// }
//              OR
class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()+1][text2.length()+1];
        for(int i[] :dp) Arrays.fill(i,-1);
        //    Performed Shifting of Indexes
        for(int j=0;j<=text2.length();j++) dp[0][j] = 0;
        for(int i=0;i<=text1.length();i++) dp[i][0] = 0;

        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                else dp[i][j] = Math.max( dp[i-1][j],dp[i][j-1] );
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
