// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

// 1365. How Many Numbers Are Smaller Than the Current Number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        for(int i : nums){
            freq[i]++;
        }
        for(int i = 1; i < 101; i++){
            freq[i]+=freq[i-1];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                nums[i] = 0;
            }else{
                nums[i] = freq[nums[i]-1];
            }
        }
        return nums;
    }
}