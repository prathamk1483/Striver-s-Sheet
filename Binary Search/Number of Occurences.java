class Solution {
    int first(int[] arr,int k){
        int n = arr.length;
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }
    int lastOccurrence(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return last;
    }

    int count(int[] arr, int k) {
        int firs = first(arr,k);
        if(firs == -1) return 0;
        int last = lastOccurrence(arr,k);
        
        return last - firs+1;
    }
}
