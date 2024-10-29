class Solution {
    private int firstOccurence(int arr[]){
        int low =0,high = arr.length-1;
        
        while(low <= high){
            
            int mid = (low + high) >> 1;
            
            if(arr[mid] == 0){
                low = mid+1;
            }else{
                if(mid == 0 || arr[mid] != arr[mid-1]){
                    return arr.length-mid;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public int rowWithMax1s(int arr[][]) {
        int n = arr.length,m=arr[0].length;
        int count_max = 0;
        int index = -1;
        for(int i =0;i<n;i++){
            int count_ones =firstOccurence(arr[i]);
            if(count_ones>count_max){
                count_max = count_ones;
                index = i;
            }
        }
        return index;
    }
}
