// https://leetcode.com/problems/power-of-three/

// 326. Power of Three

class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && (n == 1 || (n%3 == 0 && isPowerOfThree(n/3)));
    }
}