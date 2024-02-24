// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

// 1351. Count Negative Numbers in a Sorted Matrix

class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length-1, col = 0, n =grid[0].length, count = 0;
        while(row >= 0 && col < n){
            int element = grid[row][col];
            if(element < 0){
                count += n-col;
                row--;
            }else{
                col++;
            }
        }
        return count;
    }
}