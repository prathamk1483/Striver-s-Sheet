class Solution {
    private void reverse(int[] arr , int low , int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] =temp;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(nums.length == 1) return;
        k =  k%nums.length;
        int d = nums.length-k;
        reverse(nums , 0 , d-1);
        reverse(nums , d , nums.length-1);
        reverse(nums , 0 , nums.length-1);
    }
}
