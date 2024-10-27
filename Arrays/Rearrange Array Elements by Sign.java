class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int idx = 0,i=0,j=0;
        while(idx < nums.length){
            while(nums[i] < 0) i++;
            while(nums[j] > 0) j++;
            ans[idx++] = nums[i++];
            ans[idx++] = nums[j++];
        }

        return ans;
    }
}
