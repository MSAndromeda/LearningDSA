// https://leetcode.com/problems/power-of-two/

// 231. Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n == 1 || (n%2 == 0 && isPowerOfTwo(n/2)));
    }
}