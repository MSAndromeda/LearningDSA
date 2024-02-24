// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// 34. Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearch(nums, target, true),binarySearch(nums, target, false)};
    }
    private int binarySearch(int[] arr, int target, boolean flag){
        int start = 0, end = arr.length - 1, result = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                result = mid;
                if(flag) end = mid - 1;
                else start = mid + 1;
            }
            else if(arr[mid] > target ) end = mid - 1;
            else start = mid + 1;
        }
        return result;
    }
}