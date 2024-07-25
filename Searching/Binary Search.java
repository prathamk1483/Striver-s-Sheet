class Solution {
    public int helper(int s, int e,int[] nums,int target){
        if(s<=e){
            if(nums[(s+e)/2]==target){
                return (s+e)/2;
            }
            else if(target > nums[(s+e)/2]){
                return helper((s+e)/2 +1,e,nums,target);
            }
            else if(target < nums[(s+e)/2]){
                return helper(s,(s+e)/2 -1 , nums,target);
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int s=0,e=nums.length-1;
        return helper(s,e,nums,target);
    }
}
