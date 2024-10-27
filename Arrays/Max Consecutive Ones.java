class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            int temp =0;
            while( i<nums.length && nums[i]==1 ){
                temp++;
                i++;
            }
            ans = Math.max(temp,ans);
        }
        return ans;
    }
}
