// https://leetcode.com/problems/find-all-duplicates-in-an-array/

// 442. Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length, i = 0;
        while(i < len){
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i])
                swap(nums, i, correct);
            else
                i++;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(i = 0; i < len; i++){
            if(i+1 != nums[i]) result.add(nums[i]);
        }
        return result;
    }
     private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}