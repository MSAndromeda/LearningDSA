// https://leetcode.com/problems/search-insert-position/

// 35. Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}