class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int top=0,bottom=arr.length-1,left=0,right=arr[0].length-1;
        List<Integer> ans = new ArrayList<>();
        while(top <=bottom && left <=right){
            //top
            for(int i=left;i<=right;i++){
                ans.add(arr[top][i]);
            }
            top++;
            // right
            for(int i=top;i<=bottom;i++){
                ans.add(arr[i][right]);
            }
            right--;
            //bottom
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            //left
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(arr[i][left]);
                }
            left++;
            }
        }
        return ans;
    }
}
