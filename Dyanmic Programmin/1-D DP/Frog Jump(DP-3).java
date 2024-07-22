class Solution{
    private int helper(int n,int arr[],int dp[]){
        if(n == 0) return dp[n]=0;
        if(dp[n]!= -1) return dp[n];
        int one =0,two=Integer.MAX_VALUE;
        one = helper(n-1,arr,dp) + Math.abs(arr[n]-arr[n-1]);
        if(n > 1) two = helper(n-2,arr,dp) + Math.abs(arr[n]-arr[n-2]);
        
        return dp[n]=Math.min(one,two);
    }
    public int minimumEnergy(int arr[],int N){
        int dp[] = new int[N+1];
        Arrays.fill(dp,-1);
        return helper(N-1,arr,dp);
    }   
}
