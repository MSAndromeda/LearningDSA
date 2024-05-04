// https://leetcode.com/problems/n-queens-ii/

// 52. N-Queens II

class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return Queens(board, 0, n);
    }
    private int Queens(boolean[][] board, int row, int n){
        if(row == n){
            return 1;
        }
        int count = 0;
        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = true;
                count += Queens(board, row+1, n);
                board[row][col] = false;
            }
        }
        return count;
    }
    private boolean isSafe(boolean[][] board, int row, int col, int n){
        for(int i = 0; i < row; i++){
            if(board[i][col]) return false;
        }
        int leftMin = Math.min(row, col);
        int rightMin = Math.min(row, n - col - 1);
        for(int i = 1; i <= leftMin; i++){
            if(board[row-i][col-i]) return false;
        }
        for(int i = 1; i <= rightMin; i++){
            if(board[row-i][col+i]) return false;
        }
        return true;
    }
}