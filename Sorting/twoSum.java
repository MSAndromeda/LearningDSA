// https://leetcode.com/problems/two-sum/submissions/1209173203/

// 1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int ele = nums[i];
            int more = target-ele;
            if(map.containsKey(more)){
                return new int[] {map.get(more), i};
            }
            map.put(ele, i);
        }
        return new int[]{-1,-1};
    }
}