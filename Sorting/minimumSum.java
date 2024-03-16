// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/

// 2160. Minimum Sum of Four Digit Number After Splitting Digits

class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        for(int i = 0; i < 4; i++, num /= 10) digits[i] = num % 10;
        Arrays.sort(digits);
        return 10*(digits[0]+digits[1]) + digits[2]+digits[3];
    }
}