class Solution {
    public static int countPartitions(int[] a, int maxSum) {
        int n = a.length;
        int partitions = 1;
        long subarraySum = 0;
        for (int i = 0; i < n; i++) {
            if (subarraySum + a[i] <= maxSum) {
                subarraySum += a[i];
            } 
            else {
                partitions++;
                subarraySum = a[i];
            }
        }
        return partitions;
    }
    public int largestSubarraySumMinimized(int[] a, int k) {
        int low = a[0];
        int high = 0;
        for (int i = 0; i < a.length; i++) {
            low = Math.max(low, a[i]);
            high += a[i];
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(a, mid);
            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public int splitArray(int[] nums, int k) {
        return largestSubarraySumMinimized(nums,k);
    }
}

