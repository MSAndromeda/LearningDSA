// https://leetcode.com/problems/concatenation-of-array/description/

// 1929. Concatenation of Array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i] = ans[n+i] = nums[i];
        }
        return ans;
    }
}