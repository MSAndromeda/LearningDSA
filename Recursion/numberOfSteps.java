// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

// 1342. Number of Steps to Reduce a Number to Zero

class Solution {
    public int numberOfSteps(int num) {
        if(num<=1) return num;
        else if(num%2==0) return 1 + numberOfSteps(num/2);
        return 1 + numberOfSteps(num-1);
    }
}