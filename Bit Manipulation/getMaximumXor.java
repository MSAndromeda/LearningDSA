// https://leetcode.com/problems/maximum-xor-for-each-query/

// 1829. Maximum XOR for Each Query

class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int len = nums.length;
        int[] result = new int[len];
        int i = len -1, j = 0;
        result[i] = ((1<<maximumBit)-1)^nums[j];
        while(--i >= 0){
            result[i] = result[i+1]^nums[++j];
        }
        return result;
    }
}