class Solution {
    public String reverseWords(String s) {
        String[] h = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = h.length-1;i>=1;i--){
            ans.append(h[i]);
            ans.append(" ");
        }
        ans.append(h[0]);
        return ans.toString().trim();
    }
}
