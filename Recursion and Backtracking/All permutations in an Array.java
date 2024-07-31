class Solution {
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
 private void helper(List<List<Integer>> ans,List<Integer> temp,int[] nums, int l, int r){ 
        if(l == r){
            for(int i:nums) temp.add(i);
            ans.add(new ArrayList<>(temp));
            temp.clear();
            return;
        }
        else{
            for(int i=l;i<=r;i++){
                swap(nums,l,i);
                helper(ans,temp,nums,l+1,r);
                swap(nums,i,l);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(ans,temp,nums,0,nums.length-1);

        return ans;
    }
}
