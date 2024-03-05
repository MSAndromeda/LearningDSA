// https://leetcode.com/problems/first-missing-positive/

// 41. First Missing Positive

class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length, i = 0;
        while(i < len){
            int correct = nums[i] - 1;
            if(correct < len && nums[i] > 0 && nums[correct] != nums[i])
                swap(nums, i, correct);
            else
                i++;
        }
        for(i = 0; i < len; i++){
            if(i+1 != nums[i]) return i+1;
        }
        return len+1;
    }
    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}