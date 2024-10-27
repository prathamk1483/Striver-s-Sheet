class Solution {
    static void sort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
        if (arr[i] < arr.length && arr[i] != i && arr[i] != arr[arr[i]]) {
            swap(arr, i, arr[i]);
        } else {
            i++;
        }
    }
}


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public int missingNumber(int[] nums) {
        sort(nums);
        for (int i=0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
