class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0, buy =Integer.MAX_VALUE;
        for(int i: prices){
            buy = Math.min(i , buy);
            ans = Math.max(ans , i-buy);
        }
        return ans;
    }
}
