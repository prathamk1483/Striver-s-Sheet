class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer> s = new HashSet<>();
        for(int i: a) s.add(i);
        for(int i: b) s.add(i);
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i:s) ans.add(i);
        Collections.sort(ans);
        return ans;
    }
}
