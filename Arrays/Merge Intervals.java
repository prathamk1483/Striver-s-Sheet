class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        for(int i[] : intervals){
            if(ans.isEmpty() || i[0] > ans.get(ans.size()-1)[1])
                ans.add(i);
            else
                ans.get(ans.size()-1)[1] = Math.max(i[1] ,ans.get(ans.size()-1)[1] ); 
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
