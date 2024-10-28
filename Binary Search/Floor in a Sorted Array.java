class Solution {
    static int findFloor(long arr[], int n, long x) {
        int s = 0 , e = arr.length-1;
        int ans = -1;
        if(x > arr[n-1]) return n-1;
        while(s <= e){
            int mid = (s+e)/2;
            if(arr[mid] <= x){
                ans = mid;
                s = mid+1;
            }
            else e = mid-1;
        }
        return ans;
    }
}
