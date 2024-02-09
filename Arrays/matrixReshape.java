// https://leetcode.com/problems/reshape-the-matrix/description/

// 566. Reshape the Matrix

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        if(n*m != r*c) return mat;
        int[][] reshape = new int[r][c];
        int itr1=0, itr2=0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(itr2 == c){
                    itr2=0;
                    itr1++;
                }
                reshape[itr1][itr2++] = mat[i][j];
            }
        }
        return reshape;
    }
}