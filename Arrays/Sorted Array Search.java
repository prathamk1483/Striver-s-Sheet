class Solution {
    static boolean searchInSorted(int arr[], int k) {
        int i =0, j = arr.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if(arr[mid] == k) return true;
            else if(arr[mid] < k) i= mid+1;
            else j = mid-1;
        }
        return false;
    }
}
