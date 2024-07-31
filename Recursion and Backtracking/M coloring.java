class solve {
    private boolean isSafe(int colr,boolean graph[][],int[] color,int node,int n){
        for(int i=0;i<n;i++){
            if(i!= node && graph[node][i] && color[i] == colr) return false;
        }
        return true;
    }
    private boolean helper(int node,boolean graph[][],int color[], int m, int n){
        if(node == n) return true;
        for(int i=1;i<=m;i++){
            if(isSafe(i,graph,color,node,n)){
                color[node] = i;
                if(helper(node+1,graph,color,m,n)) return true;
                color[node] = 0;
            }
        }
        return false;
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int color[] = new int[n];
        if(helper(0,graph,color,m,n)) return true;
        return false;
    }
}
