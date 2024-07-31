class Solution {
    // Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n) {
        int top = 0,down = n-1;
        while(top<down){
            if(M[top][down] == 1) top++;
            else if(M[down][top] == 1) down--;
            else{
                top++;
                down--;
            }
        }
        if(top > down) return -1;
        for(int i=0;i<n;i++){
            if(i == top) continue;
            if(M[top][i] == 0 && M[i][top] == 1) continue; 
            else{
                return -1;
            }
        }
        return top;
    }
}
