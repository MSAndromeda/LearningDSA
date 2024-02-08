// https://leetcode.com/problems/transpose-matrix/description/

// 867. Transpose Matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        int[][] trans = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
}