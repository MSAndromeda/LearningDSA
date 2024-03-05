// https://leetcode.com/problems/missing-number/

// 268. Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length, i = 0;
        while(i < len){
            int correct = nums[i];
            if(correct < len && correct != i)
                swap(nums, i, correct);
            else
                i++;
        }
        for(i = 0; i < len; i++){
            if(i != nums[i]) return i;
        }
        return len;
    }
    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}