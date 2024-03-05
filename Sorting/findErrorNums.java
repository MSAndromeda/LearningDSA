// https://leetcode.com/problems/set-mismatch/

// 645. Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int len = nums.length, i = 0;
        while(i < len){
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i])
                swap(nums, i, correct);
            else
                i++;
        }
        for(i = 0; i < len; i++){
            if(i+1 != nums[i]){
                result[0] = nums[i];
                result[1] = i+1;
            }
        }
        return result;
    }
    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}