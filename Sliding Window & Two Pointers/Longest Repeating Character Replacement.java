class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0,freq=0,ans = 0;
        int len = s.length();
        int hash[] = new int[26];
        while(j<len){
            char c = s.charAt(j);
            hash[c-'A']++;
            freq = Math.max(freq,hash[c-'A']);
            if((j-i+1)-freq > k ){
                char  l = s.charAt(i);
                hash[l-'A']--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
