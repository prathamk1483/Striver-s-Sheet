class Solution {
    private int findpivot(int[] num, int i, int j) {
        if (i==j) return -1;
        int mid=(i+j)/2;
        if (num[mid]>num[mid+1]) return mid;
        if (num[mid]<=num[i]) return findpivot(num, i, mid);
        return findpivot(num,mid+1,j);
    }
    public int findKRotation(List<Integer> arr) {
        int num[] = new int[arr.size()];
        int idx =0;
        for(int i: arr) num[idx++] = i;
        return (findpivot(num,0,num.length-1)+1)%num.length;
    }
}
