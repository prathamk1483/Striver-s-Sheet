class Solution {
    private int calcTime(int mid , int[] piles){
        int ans = 0;
        for(int i=0;i<piles.length;i++) ans += Math.ceil((double)piles[i]/(double)mid);
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++) max = Math.max(piles[i],max);

        int low = 1;
        int ans = max;
        while(low <= max){
            int mid = (low+max)/2;
            int time = calcTime(mid,piles);
            if( time <= h){
                max = mid-1;
            }
            else low = mid+1;
        }

        return low;
    }
}
