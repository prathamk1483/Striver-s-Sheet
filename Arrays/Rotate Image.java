class Solution {
    public void rotate(int[][] S) {
        for (int i = 0; i < S.length; i++) {
            for (int j = i + 1; j < S[0].length; j++) {
                int temp = S[i][j];
                S[i][j] = S[j][i];
                S[j][i] = temp;
            }
        }
        for (int i = 0; i < S.length; i++) {
            for (int j = 0; j < S[0].length/2; j++) {
                int t=S[i][j];
                S[i][j]=S[i][S[0].length-1-j];
                S[i][S[0].length-1-j]=t;
            }
        }

    }
}
