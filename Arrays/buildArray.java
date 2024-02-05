// https://leetcode.com/problems/build-array-from-permutation/

// 1920. Build Array from Permutation

class Solution {
    public int[] buildArray(int[] nums) {
        int numlen = nums.length;
        int[] ans = new int[numlen];
        for(int i = 0; i < numlen; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}