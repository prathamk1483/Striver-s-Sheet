class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int k=0;k<nums.length-2;k++){
            int i=k+1,j=nums.length-1;
            if(k>0 && nums[k]==nums[k-1]) {
                continue;
            }
            while(i<j){
                if(nums[i] + nums[j] + nums[k] == 0){
                    ans.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    while(i<j && nums[i]==nums[i+1]) i++;
                    while(i<j && nums[j]==nums[j-1]) j--;
                    i++;j--;
                }
                else if(nums[i] + nums[j] + nums[k] > 0) j--;
                else i++;
            }
        }
        return ans;
    }
}
