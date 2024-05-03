// https://leetcode.com/problems/target-sum/

// 494. Target Sum

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return Recursion(nums, target, 0);
    }
    public int Recursion(int[] nums, int target, int index){
        if(target == 0 && index == nums.length) return 1;
        int count = 0;
        if(nums.length != index){
        count += Recursion(nums, target-nums[index], index+1);
        count += Recursion(nums, target+nums[index], index+1);
        }
        return count;
    }
}