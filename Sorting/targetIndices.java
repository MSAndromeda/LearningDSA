// https://leetcode.com/problems/find-target-indices-after-sorting-array/

// 2089. Find Target Indices After Sorting Array

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0, n = nums.length;
        while(i < n && nums[i]!=target) i++;
        while(i < n && nums[i]==target) res.add(i++);
        return res;
    }
}