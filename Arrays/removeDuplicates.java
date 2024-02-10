// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int ind = 0;
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[ind]!=nums[i]){
                nums[++ind] = nums[i];
                k++;
            }
        }
        return k;
    }
}