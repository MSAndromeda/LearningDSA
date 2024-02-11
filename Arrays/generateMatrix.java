// https://leetcode.com/problems/spiral-matrix-ii/

// 59. Spiral Matrix II

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int up = 0,  down = n - 1;
        int left = 0, right = n - 1;
        int element = 1;
        while(element <= n*n){
            for(int j = left; j <= right && element<= n*n; j++)
                res[up][j] = element++;
            for(int i = up+1; i <= down-1 && element<= n*n; i++)
                res[i][right] = element++;
            for(int j = right; j >= left && element<= n*n; j--)
                res[down][j] = element++;
            for(int i = down-1; i >= up+1 && element<= n*n; i--)
                res[i][left] = element++;
            left++;right--;up++;down--;
        }
        return res;
    }
}