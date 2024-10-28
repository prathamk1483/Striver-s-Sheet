class Solution {
    public int maxProduct(int[] nums) {
        int p = 1,s =1,ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(p == 0) p =1;
            if(s == 0) s =1;
            p*=nums[i];
            s*=nums[nums.length-1-i];
            ans = Math.max(ans , Math.max(s,p));
        }   
        return ans;
    }
}
