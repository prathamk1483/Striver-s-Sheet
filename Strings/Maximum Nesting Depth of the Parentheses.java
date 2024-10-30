class Solution {
    public int maxDepth(String s) {
        int ans = 0,count=0;
        for(int i: s.toCharArray()){
            if(i == '(') count++;
            else if(i == ')') count--;
            ans = Math.max(count,ans);
        }
        return ans;
    }
}
