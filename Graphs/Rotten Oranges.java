class Solution {
    class Pair{
        int row,col,time;
        Pair(int i,int j,int t){
            this.row = i;
            this.col = j;
            this.time = t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int visited[][] = new int[grid.length][grid[0].length];
        Queue<Pair> q = new LinkedList<>();
        int countFresh =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    visited[i][j] =2;
                    q.add(new Pair(i,j,0));
                }
                else visited[i][j] =0;
                if(grid[i][j] == 1) countFresh++;
            }
        }

        int drows[] = {-1,0,1,0};
        int dcols[] = {0,1,0,-1};

        int ans = 0;
        int rotten =0;
        while(!q.isEmpty()){
            Pair temp = q.remove();
            int row = temp.row;
            int col = temp.col;
            int time = temp.time;
            ans = Math.max(ans,time);
            for(int i=0;i<4;i++){
                int r = row +drows[i];
                int c = col +dcols[i];

                if(r >=0 && r <grid.length && c >=0 && c < grid[0].length && visited[r][c]!=2 && grid[r][c] == 1){
                    visited[r][c] = 2;
                    rotten++;
                    q.add(new Pair(r,c,time+1));
                }
            }
        }
        
        return countFresh == rotten ? ans : -1;
    }
}
