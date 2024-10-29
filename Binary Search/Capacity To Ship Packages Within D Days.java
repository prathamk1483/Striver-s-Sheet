class Solution {
    private boolean possible(int mid , int[] arr,int d){
        int days =1,sum=0;
        for(int i :arr){
            if(sum + i <= mid)sum+=i;
            else{
                sum = 0;
                days++;
                sum+=i;
            }
        }
        return days <= d;
    }
    public int shipWithinDays(int[] arr, int d) {
        int s = Integer.MIN_VALUE,e = 0;
        for(int i :arr){
            s = Math.max(i,s);
            e += i;
        }
        int ans = 0;
        while(s <= e){
            int mid = (s+e)/2;
            if(possible(mid,arr,d)){
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }
        return s;
    }
}
