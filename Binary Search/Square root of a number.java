class Solution {
    long floorSqrt(long n) {
       long s = 0, e = n,ans =0;
       
       while(s <=e){
           long mid = (s+e)/2;
           if(mid *mid == n) return mid;
           else if(mid*mid < n){
               s = mid+1;
               ans = mid;
           }
           else e = mid-1;
       }
       
       return ans;
    }
}
