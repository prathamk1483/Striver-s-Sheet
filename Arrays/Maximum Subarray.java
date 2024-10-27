class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE, cs =0;
        for(int i:nums){
            cs = Math.max(cs+i,i);
            ans = Math.max(ans, cs);
        }

        return ans;
    }
}
