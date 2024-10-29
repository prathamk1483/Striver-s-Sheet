class Solution {
    public String removeOuterParentheses(String s) {
        int isopen =0 , n =s.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '(' && isopen++ > 0) ans.append(s.charAt(i));
            else if(s.charAt(i) == ')' && isopen-- > 1) ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
