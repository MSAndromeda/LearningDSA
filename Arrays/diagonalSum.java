// https://leetcode.com/problems/matrix-diagonal-sum/description/

// 1572. Matrix Diagonal Sum

class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int diagSum = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if((i==j)||((i+j)==(m-1))) diagSum += mat[i][j];
            }
        }
        return diagSum;
    }
}