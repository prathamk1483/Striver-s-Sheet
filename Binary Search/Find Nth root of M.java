class Solution
{
    public int NthRoot(int n, int m)
    {
        int l=0;
        int r=m;
        
        while(l<=r){
            int mid=(l+r)/2;
            if(Math.pow(mid,n) == m){
                return mid;
            }
            else if(Math.pow(mid,n) < m){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
}
