class Solution {
    public int longestConsecutive(int[] a) {
        if(a.length == 1 || a.length ==0 ) return a.length;
        Arrays.sort(a);
        int result =1,ans=1;
        for(int i=1;i<a.length;i++){
            if(a[i-1]+1 == a[i] ) result++;
            else if(a[i-1] == a[i]) continue;
            else{
                result=1;
            }
            ans = Math.max(result,ans);
        }
        return ans;
    }
}
