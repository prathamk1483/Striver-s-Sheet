class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int s = 0,e = arr.length-1;
        int floor =-1 , ceil =-1;
        Arrays.sort(arr);
        while(s <= e){
            int mid = (s+e)/2;
            if(arr[mid] == x) return new int[] {arr[mid],arr[mid]};
            else if(arr[mid] > x){
                ceil = arr[mid];
                e = mid-1;
                // return new int[] {floor,ceil};
            }
            else{
                floor = arr[mid];
                s = mid+1;
            }
        }
        
        return new int[] {floor,ceil};
    }
}
