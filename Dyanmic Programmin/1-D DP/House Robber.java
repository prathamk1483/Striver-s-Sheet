class Solution {
    private int helper(int[] nums,int idx,int[] memo){
        if(idx>= nums.length) return 0;
        if(memo[idx]!= -1) return memo[idx];
        return memo[idx]=Math.max( helper(nums,idx+1,memo),nums[idx]+helper(nums,idx+2,memo) );
    }
    public int rob(int[] nums) {
        // int[] memo = new int[nums.length+1];
        // Arrays.fill(memo,-1);
        // return helper(nums,0,memo);

    if (nums.length == 0) return 0;
    int[] dp = new int[nums.length + 1];
    dp[0] = 0;
    dp[1] = nums[0];
    for (int i = 1; i < nums.length; i++) {
        int val = nums[i];
        dp[i+1] = Math.max(dp[i], dp[i-1] + val);
    }
    return dp[nums.length];
    }
}
