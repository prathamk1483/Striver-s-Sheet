// class Solution {
//     private int helper(int[][] grid , int i,int j,int dp[][]){
//         if(i < 0 || j < 0 ) return Integer.MAX_VALUE;
//         if(dp[i][j] != -1) return dp[i][j];
//         if(i == 0 && j == 0) return grid[i][j];
//         int up = helper(grid,i-1,j,dp);
//         int left = helper(grid,i,j-1,dp);


//         return dp[i][j] = grid[i][j] + Math.min(up,left);
//     }
//     public int minPathSum(int[][] grid) {
//         int dp[][] = new int[grid.length][grid[0].length];
//         for(int i[] : dp) Arrays.fill(i,-1);

//         return helper(grid,grid.length-1,grid[0].length-1,dp);
//     }
// }

class Solution {

    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length+1][grid[0].length+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i == 0 && j == 0) dp[i][j] = grid[i][j];
                else{
                    int up = Integer.MAX_VALUE , left = Integer.MAX_VALUE;
                    if(i > 0) up = dp[i-1][j];
                    if(j > 0) left = dp[i][j-1];
                    dp[i][j] = grid[i][j] + Math.min(up , left);
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}
