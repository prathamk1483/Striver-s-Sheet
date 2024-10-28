class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] helper = new int[nums1.length + nums2.length];
        int it=0;
        for(int i=0;i<nums1.length;i++) helper[it++] = nums1[i];
        for(int i=0;i<nums2.length;i++) helper[it++] = nums2[i];

        Arrays.sort(helper);
        if(helper.length %2 == 0){
            int i = helper.length/2;
            return (double)(((double)helper[i-1] + (double)helper[i]) /(double)2);
        }
        return (double)( (double)helper[helper.length/2]);
    }
}
