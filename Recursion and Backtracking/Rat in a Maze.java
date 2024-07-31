


class Solution {
    private static boolean isSafe(int x,int y,int[][] m,boolean[][] visited){
        if(x >=0 && x< m.length && y>=0 && y<m.length){
            if(!visited[x][y] && m[x][y]!=0){
                return true;
            }
            else return false;
        }
        else return false;
    }
    private static void helper(ArrayList<String> h,boolean[][] visited,int[][] m,int n ,int x,int y,String c){
        if(x == n-1 && y == n-1){
            h.add(new String(c));
        }
        String options = "DLRU";
        if(isSafe(x+1,y,m,visited)){
            visited[x][y] = true;
            helper(h,visited,m,n,x+1,y,c+"D");
            visited[x][y] = false;
        }
        if(isSafe(x,y+1,m,visited)){
            visited[x][y] = true;
            helper(h,visited,m,n,x,y+1,c+"R");
            visited[x][y] = false;
        }
        if(isSafe(x-1,y,m,visited)){
            visited[x][y] = true;
            helper(h,visited,m,n,x-1,y,c+"U");
            visited[x][y]  = false;
        }
        if(isSafe(x,y-1,m,visited)){
            visited[x][y] = true;
            helper(h,visited,m,n,x,y-1,c+"L");
            visited[x][y] = false;
        }
        else return;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        if(m[0][0] == 0) return new ArrayList<>();
        boolean visited[][] = new boolean[n][n];
        ArrayList<String> h = new ArrayList<>();
        helper(h,visited,m,n,0,0,"");
        return h;
    }
}
