class Solution {
    private int findpivot(int[] num, int i, int j) {
        if (i==j) return -1;
        int mid=(i+j)/2;
        if (num[mid]>num[mid+1]) return mid;
        if (num[mid]<=num[i]) return findpivot(num, i, mid);
        return findpivot(num,mid+1,j);
    }
    public int findMin(int[] nums) {
        int pivot = findpivot(nums,0,nums.length-1);
        return pivot == -1 ? nums[0] : nums[(pivot+1)%nums.length];
    }
}
