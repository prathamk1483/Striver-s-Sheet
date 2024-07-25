class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, ans = 0;
        Map<Character, Integer> m = new HashMap<>();
        
        while (j < s.length()) {
            char c = s.charAt(j);
            if (m.containsKey(c) && m.get(c) >= i) {
                i = m.get(c) + 1;
            }
            m.put(c, j);
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        
        return ans;
    }
}
