// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

// 1295. Find Numbers with Even Number of Digits

class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int n : nums){
            if((int)(Math.log10(n)%2) == 1) c++;
        }
        return c;
    }
}