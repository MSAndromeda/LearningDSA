// https://leetcode.com/problems/word-search/

// 79. Word Search

class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((word.charAt(0) == board[i][j]) && backtrack(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board, int r, int c, String word, int ind){
        if(ind == word.length()) return true;
        if(r<0 || c<0 || r == board.length || c == board[r].length || board[r][c] != word.charAt(ind) || visited[r][c]) return false;
        visited[r][c] = true;
        if( backtrack(board, r-1, c, word, ind+1) ||
            backtrack(board, r+1, c, word, ind+1) ||
            backtrack(board, r, c-1, word, ind+1) ||
            backtrack(board, r, c+1, word, ind+1)) return true;
        
        visited[r][c] = false;
        return false;
    }
}