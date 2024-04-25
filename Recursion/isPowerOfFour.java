// https://leetcode.com/problems/power-of-four/

// 342. Power of Four

class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n == 1 || (n%4 == 0 && isPowerOfFour(n/4)));
    }
}