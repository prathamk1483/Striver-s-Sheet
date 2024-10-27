class Solve {
    int[] findTwoElement(int arr[]) {
        boolean visited[] = new boolean[arr.length+1];
        int r = -1 , m =-1;
        for(int i: arr){ 
            if(visited[i]) r = i;
            visited[i] = true;
        }
        for(int i=1;i<visited.length;i++){
            if(!visited[i]){
                m = i;
                break;
            }
        }
        return new int[]{r,m};
        
    }
}
