class Solution {
    private boolean isSafe(char[][] board,int x,int y){
        for(int i=x;i>=0;i--) if(board[i][y] == 'Q') return false;
        for(int i=y;i>=0;i--) if(board[x][i] == 'Q') return false;
        for(int i=x,j=y;i>=0 && j>=0;i--,j--) if(board[i][j] == 'Q') return false;
        for(int i=x,j=y;i>=0 && j<board.length;i--,j++) if(board[i][j] == 'Q') return false;
        return true;
    }
    private void helper(List<List<String>> ans,char[][] board,int x){
        if(x == board.length){
            List<String> temp = new ArrayList<>();
            for(char[] i :board){
                temp.add(new String(i));
            }
            ans.add(temp);
            return;
        }
        else{
            for(int i=0;i<board.length;i++){
                if(isSafe(board,x,i)){
                    board[x][i] = 'Q';
                    helper(ans,board,x+1);
                    board[x][i] = '.';
                }
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        for(char i[] : board) Arrays.fill(i,'.');

        helper(ans,board,0);
        return ans;
    }
}
