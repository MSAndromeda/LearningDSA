// https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/description/

// 1611. Minimum One Bit Operations to Make Integers Zero

class Solution {
    public int minimumOneBitOperations(int n) {
        int result = 0;
        while(n!=0){
            result ^= n;
            n >>= 1;
        }
        return result;
    }
}