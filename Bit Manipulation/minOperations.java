// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/

// 2997. Minimum Number of Operations to Make Array XOR Equal to K

class Solution {
    public int minOperations(int[] nums, int k) {
        for(int num: nums){
            k ^= num;
        }
        return setbits(k);
    }
    private int setbits(int n){
        int count = 0; 
        while(n!=0){
            n &= (n-1);
            count++;
        }
        return count;
    }
}