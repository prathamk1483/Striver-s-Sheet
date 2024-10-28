class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s = 0 , e = arr.length-1;

        while(s <= e){
            int mid = (s+e)/2;
            int totMissing = arr[mid] - (mid + 1);
            if (totMissing < k)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return e +k+1;
    }
}
