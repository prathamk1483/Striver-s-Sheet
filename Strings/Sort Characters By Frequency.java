class Solution {
    public String frequencySort(String s) {
        Map<Character , Integer> m = new HashMap<>();
        for(char i: s.toCharArray()){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Character> l = new ArrayList<>(m.keySet());
        Collections.sort(l , (a,b) -> m.get(b)-m.get(a) );
        StringBuilder ans = new StringBuilder();
        for(char i : l){
            int count = m.get(i);
            for(int j=0;j<count;j++){
                ans.append(i);
            }
        }
        return ans.toString();
    }
}
