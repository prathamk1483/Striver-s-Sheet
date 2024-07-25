class Solution {
    public int print2largest(List<Integer> arr) {
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>l){
                sl=l;
                l=arr.get(i);
            }
            if(arr.get(i)<l && arr.get(i)>sl){
                sl=arr.get(i);
            }
        }
        return sl;

    }
}
