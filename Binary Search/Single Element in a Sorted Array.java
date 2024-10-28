class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(mid%2 == 1) mid--;
            if(nums[mid] != nums[mid+1]) j = mid;
            else{
                i = mid+2 ;
            }
        }
        return nums[i];
    }
}
