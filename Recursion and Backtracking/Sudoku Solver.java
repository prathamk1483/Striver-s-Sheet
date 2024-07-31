class Solution {
    public boolean isSafe(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[row][i] == c) return false;
            if(board[i][col] == c) return false;
            if(board[ 3*(row/3)+(i/3) ][ 3*(col/3)+(i%3) ] == c) return false;
        }
        return true;
    }
    public boolean helper(char[][] board,int row,int col){
        if(row == 9){
            return true;
        }
        int nextrow = row,nextcol = col+1;
        if(nextcol == 9){
            nextcol = 0;
            nextrow = row+1;
        }
        if(board[row][col] != '.'){
            return helper(board,nextrow,nextcol);
        }
        for(char i='1';i<='9';i++){
            if(isSafe(board,row,col,i)){
                board[row][col]=i;
                if(helper(board,nextrow,nextcol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
        return;
    }
}
