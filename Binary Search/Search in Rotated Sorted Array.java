class Solution {
    private int findpivot(int[] num, int i, int j) {
        if (i==j) return -1;
        int mid=(i+j)/2;
        if (num[mid]>num[mid+1]) return mid;
        if (num[mid]<num[i]) return findpivot(num, i, mid);
        return findpivot(num,mid+1,j);
    }
    private int binarysearch(int[] num, int i, int j, int key) {
        while (i<=j){
            int mid=(i+j)/2;
            if (num[mid]==key) return mid;
            if (num[mid]<key) i=mid+1;
            else j = mid - 1;
        }
        return -1;
    }

    public int search(int[] num, int target) {
        if (num.length == 1) {
            if (num[0] == target) return 0;
            else return -1;
        }
        int pivotpos = findpivot(num, 0, num.length - 1);
        int right=binarysearch(num,pivotpos+1,num.length-1,target);
        int left=binarysearch(num, 0, pivotpos, target);
        if (right != -1) return right;
        else if (left != -1) return left;
        return -1;
    }
}
