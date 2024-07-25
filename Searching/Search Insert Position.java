class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid = j+(i-j)/2;
            if(j-i == 1 || j==i){
                if(target > nums[i]) return target>nums[j] ? j+1:j;
                else return  i; 
            }
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target) j=mid-1;
            else i = mid+1;
        }
        return target > nums[nums.length-1] ? nums.length : nums.length-1;
    }
}
