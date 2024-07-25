class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,ans=0,z=0;
        while(j<nums.length){
            if(nums[j] == 0) z++;
            while(z>k){
                if(nums[i] == 0)z--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}


// OR


class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,ans=0,z=0;
        while(j<nums.length){
            if(nums[j] == 0) z++;
            if(z>k){
                if(nums[i] == 0)z--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
