// https://leetcode.com/problems/maximum-xor-after-operations/

// 2317. Maximum XOR After Operations 

class Solution {
    public int maximumXOR(int[] nums) {
        int answer = 0;
        for(int num: nums){
            answer |= num;
        }
        return answer;
    }
}