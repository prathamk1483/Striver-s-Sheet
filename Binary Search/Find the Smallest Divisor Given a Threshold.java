class Solution {
    private int getSum(int mid , int[] nums){
        int ans = 0;
        for(int i : nums) ans += Math.ceil((double)i/(double)mid);
        return ans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int i:nums) max = Math.max(max,i);
        int s = 0,e  = max;
        int ans = 0;
        while(s <= e){
            int mid = (s+e)/2;
            int sum = getSum(mid,nums);
            if(sum <= threshold){ 
                e = mid -1 ;
            }
            else {
                s = mid +1;
            }
        }
        return s;
    }
}
