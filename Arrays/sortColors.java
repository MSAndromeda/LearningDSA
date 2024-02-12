// https://leetcode.com/problems/sort-colors/

// 75. Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] num = new int[3];
        for(int i = 0; i < n; i++){
            num[nums[i]]++;
        }
        int i = 0;
        while(i < n){
            if(i < num[0]) nums[i] = 0;
            else if(i < (num[0]+num[1])) nums[i] = 1;
            else nums[i] = 2;
            i++;
        }
    }
}