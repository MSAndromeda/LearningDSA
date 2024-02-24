// https://leetcode.com/problems/single-element-in-a-sorted-array/

// 540. Single Element in a Sorted Array

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int arrlen = nums.length - 1;
        int start = 0, end = arrlen;
        while(start<=end){
            int mid = start + (end-start)/2;
            int prev = (mid>0)?nums[mid-1]:Integer.MAX_VALUE;
            int ele = nums[mid];
            int next = (mid<arrlen)?nums[mid+1]:Integer.MAX_VALUE;
            if(prev!=ele && ele!=next) return ele;
            else if(mid%2 == 0){
                if(ele==next) start = mid + 1;
                else end = mid - 1;
            }
            else{
                if(ele==prev) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}