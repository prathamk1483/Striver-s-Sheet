class Solution {

    public int minimizeCost(int arr[], int N, int K) {
        int dp[] = new int[N];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        
        for(int i=1;i<N;i++) {
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=K;j++) {
                if(i-j < 0) break;
                int cost = dp[i-j] + Math.abs(arr[i] - arr[i-j]);
                min = Math.min(min, cost);
            }
            dp[i] = min;
        }
        return dp[N-1];
    }
}
