class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] h = new int[26];
        for(int i=0;i<s.length();i++){
            h[s.charAt(i)-'a']++;
            h[t.charAt(i)-'a']--;
        }
        for(int i:h ) if(i!=0) return false;
        return true;
    }
}
