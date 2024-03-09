// https://leetcode.com/problems/subsets/

// 78. Subsets

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        int bits = (int)Math.pow(2, len);
        for(int i = 0; i < bits; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < len; j++){
                if((i&(1<<j))!=0) temp.add(nums[j]);
            }
            result.add(temp);
        }
        return result;
    }
}