// https://leetcode.com/problems/shuffle-the-array/description/

// 1470. Shuffle the Array

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2*n];
        for(int i = 0; i < 2*n; i+=2){
            answer[i] = nums[i/2];
            answer[i+1] = nums[n+i/2];
        }
        return answer;
    }
}