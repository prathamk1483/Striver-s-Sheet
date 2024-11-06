class Solution {
    int[] dx = new int[]{0,0,1,-1};
    int[] dy = new int[]{1,-1,0,0};
    public void dfs(int x, int y, boolean[][] v,int[][] b){
        v[x][y] = true;
        for(int i = 0;i<4;i++) {
            int r = x + dx[i];
            int c = y + dy[i]; 
            if(r >=0 && r <b.length && c >= 0 && c < b[0].length && v[r][c] == false && b[r][c] == 1) {
                dfs(r, c, v, b); 
            }
        }
    }
    public int numEnclaves(int[][] board) {
        boolean v[][] = new boolean[board.length][board[0].length];
        for(int i = 0;i<board.length;i++){
            if(v[i][0] == false && board[i][0] == 1){
                dfs(i,0,v,board);
            }
            if(v[i][board[0].length-1] == false && board[i][board[0].length-1] == 1){
                dfs(i,board[0].length-1,v,board);
            }
        }
        for(int i = 0;i<board[0].length;i++){
            if(v[0][i] == false && board[0][i] == 1){
                dfs(0,i,v,board);
            }
            if(v[board.length-1][i] == false && board[board.length-1][i] == 1){
                dfs(board.length-1,i,v,board);
            }
        }
        int ans = 0;
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(v[i][j] == false && board[i][j] == 1){
                    v[i][j] = true;
                    ans++;
                }
            }
        }

        return ans;
    }
}
