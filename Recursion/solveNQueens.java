// https://leetcode.com/problems/n-queens/

// 51. N-Queens

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> List = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        queens(List, board, 0, n);
        return List;
    }
    private void queens(List<List<String>> List, boolean[][] board, int row, int n){
        if(row==n){
            List.add(compiledList(board, n));
            return;
        }
        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = true;
                queens(List, board, row+1, n);
                board[row][col] = false;
            }
        }
    }
    private boolean isSafe(boolean[][] board, int row, int col, int n){
        for(int i = 0; i < row; i++){
            if(board[i][col]) return false;
        }
        int leftMin = Math.min(row, col);
        for(int i = 1; i <= leftMin; i++){
            if(board[row-i][col-i]) return false;
        }
        int rightMin = Math.min(row, n-1-col);
        for(int i = 1; i <= rightMin; i++){
            if(board[row-i][col+i]) return false;
        }
        return true;
    }
    private List<String> compiledList(boolean[][] board, int n){
        List<String> Ls = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String temp = "";
            for(int j = 0; j < n; j++){
                if(board[i][j]) temp+="Q";
                else temp+=".";
            }
            Ls.add(temp);
        }
        return Ls;
    }
}