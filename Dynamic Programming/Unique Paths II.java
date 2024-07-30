class Solution {
    private int helper(int arr[][],int i, int j,int dp[][]){
        if(i>=0 && j>= 0 && arr[i][j] == 1) return 0;
        if(i == 0 && j == 0) return 1;
        if(i<0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        int up = helper(arr, i-1,j,dp);
        int left = helper(arr,i,j-1,dp);

        return dp[i][j] = up+ left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1) return 0;
        int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i[] :dp) Arrays.fill(i,-1);
        return helper(obstacleGrid,obstacleGrid.length-1,obstacleGrid[0].length-1,dp);
    }
}
