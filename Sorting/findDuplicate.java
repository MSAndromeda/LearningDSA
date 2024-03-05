// https://leetcode.com/problems/find-the-duplicate-number/

// 287. Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
       int len = nums.length, i = 0;
        while(i < len){
            if(i + 1 != nums[i]){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct])
                    swap(nums, i, correct);
                else
                    return nums[i];
            }
            else
                i++;
        }
        return -1;
    }
    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}