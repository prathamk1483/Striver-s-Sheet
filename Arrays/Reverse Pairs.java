class Solution {
    int count =0;
    private void merge(int[] nums, int s ,int mid , int e){
        int[] left = Arrays.copyOfRange(nums,s,mid+1);
        int[] right = Arrays.copyOfRange(nums,mid+1,e+1);

        int i=0,j=0,k=s;
        while(i < left.length && j < right.length){
            if((long)left[i] > 2*(long)right[j]){ 
                count += left.length - i;
                j++;    
            }
            else i++;
        }
        i=0;j=0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]) nums[k++] = left[i++];
            else nums[k++] = right[j++];
        }
        while(i < left.length){
            nums[k++] = left[i++];
        }
        while(j < right.length) nums[k++] = right[j++];

        return;
    }
    private void mergeSort(int[] nums,int s , int e){
        if(s >= e) return;
        int mid = (s+e)/2;
        mergeSort(nums,s,mid);
        mergeSort(nums,mid+1,e);

        merge(nums,s,mid,e);
    }
    public int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return count;
    }
}
