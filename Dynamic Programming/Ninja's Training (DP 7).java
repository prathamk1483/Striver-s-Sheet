//RECURSION
// class Solution{
//     private int helper(int points[][],int d,int last){
//         if(d == 0){
//             int max = Integer.MIN_VALUE;
//             for(int i=0;i<3;i++){
//                 if(i == last) continue;
//                 max = Math.max(max,points[0][i]);
//             }
//             return max;
//         }
//         int ans = Integer.MIN_VALUE;
//         for(int i=0;i<3;i++){
//             if(i == last) continue;
//             int point = points[d][i] + helper(points,d-1,i);
//             ans = Math.max(ans,point);
//         }
//         return ans;
//     }
//     public int maximumPoints(int points[][],int N){
//         return helper(points,N-1,-1);
//     }
// }


// MEMOIZATION
// class Solution {
//     private int helper(int points[][], int d, int last, int dp[][]) {
//         if (d == 0) {
//             int max = Integer.MIN_VALUE;
//             for (int i = 0; i < 3; i++) {
//                 if (i == last) continue;
//                 max = Math.max(max, points[0][i]);
//             }
//             return max;
//         }
//         if (dp[d][last] != -1) return dp[d][last];
//         int ans = Integer.MIN_VALUE;
//         for (int i = 0; i < 3; i++) {
//             if (i == last) continue;
//             int point = points[d][i] + helper(points, d - 1, i, dp);
//             ans = Math.max(ans, point);
//         }
//         return dp[d][last] = ans;
//     }

//     public int maximumPoints(int points[][], int N) {
//         int dp[][] = new int[N][4];
//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }
//         return helper(points, N - 1, 3, dp); 
//     }
// }




// TABULATION
class Solution {
    public int maximumPoints(int points[][], int N) {
        int dp[][] = new int[N][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        dp[0][0] = Math.max(points[0][2],points[0][1]);
        dp[0][1] = Math.max(points[0][2],points[0][0]);
        dp[0][2] = Math.max(points[0][0],points[0][1]);
        dp[0][3] = Math.max(points[0][0],Math.max(points[0][1],points[0][2]));
        for(int day=1;day<points.length;day++){
            for(int last =0;last<4;last++){
                int ans = Integer.MIN_VALUE;
                dp[day][last] = 0;
                for(int task=0;task<3;task++){
                    if(task == last) continue;
                    int point = points[day][task] + dp[day-1][task];
                    ans = Math.max(point,ans);
                }
                dp[day][last] = ans;
            }
            
        }
        return dp[N-1][3];
    }
}
