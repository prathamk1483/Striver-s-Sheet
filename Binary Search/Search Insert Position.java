class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0 , e = nums.length-1 , ans = -1;
        if(target < nums[0] ) return 0; 
        else if(target > nums[nums.length-1]) return nums.length;
        while(s <= e){
            int mid = (s+e)/2;
            if(nums[mid] >= target){
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }

        return ans;
    }
}
