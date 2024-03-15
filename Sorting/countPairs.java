// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/

// 2824. Count Pairs Whose Sum is Less than Target

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int res = 0, i = 0, j = nums.size()-1;
        while(i < j){
            if((nums.get(i)+nums.get(j))<target){
                res += j-i;
                i++;
            }else j--;
        }
        return res;
    }
}