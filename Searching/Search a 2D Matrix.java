class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1 , row = 0;
        while(row < matrix.length && col > -1){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) row++;
            else if(matrix[row][col] > target) col--;
        }
        return false;
    }
}
