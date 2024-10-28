class Solution {
    public int inversionCount(int[] nums) {
        int[] count = {0}; // Using an array to keep count mutable across recursive calls
        mergeSort(nums, 0, nums.length - 1, count);
        return count[0];
    }

    private void mergeSort(int[] nums, int start, int end, int[] count) {
        if (start >= end) return;

        int mid = (start + end) / 2;
        mergeSort(nums, start, mid, count);
        mergeSort(nums, mid + 1, end, count);

        merge(nums, start, mid, end, count);
    }

    private void merge(int[] nums, int start, int mid, int end, int[] count) {
        int[] left = Arrays.copyOfRange(nums, start, mid + 1);
        int[] right = Arrays.copyOfRange(nums, mid + 1, end + 1);

        int i = 0, j = 0, k = start;

        while (i < left.length && j < right.length) {
            if ((long) left[i] <= (long) right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
                count[0] += left.length - i;
            }
        }

        while (i < left.length) {
            nums[k++] = left[i++];
        }
        while (j < right.length) {
            nums[k++] = right[j++];
        }
    }
}
