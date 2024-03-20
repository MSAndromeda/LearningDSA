// https://leetcode.com/problems/sort-array-by-parity/

// 905. Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums;
        int i = 0, j = n-1;
        while(i <= j){
            while(i<n&&(nums[i]&1)==0) i++;
            while(j>=0&&(nums[j]&1)==1) j--;
            if(i <= j){
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j--] = temp;
            }
        }
        return nums;
    }
}