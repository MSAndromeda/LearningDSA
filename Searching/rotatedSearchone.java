// https://leetcode.com/problems/search-in-rotated-sorted-array/

// 33. Search in Rotated Sorted Array

class Solution {
    public int search(int[] nums, int target) {
    int peak = findpeak(nums);
    if(peak == -1) return binarySearch(nums, 0, nums.length-1, target);
    if(target<nums[0]){
        return binarySearch(nums, peak+1, nums.length-1, target);
    }
    return binarySearch(nums, 0, peak, target);
    }
    private int findpeak(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]) return mid;
            if(mid > start && arr[mid] < arr[mid-1]) return mid-1;
            if(arr[mid] > arr[start]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    private int binarySearch(int[] arr, int start, int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target) start = mid + 1;
            else if(arr[mid]>target) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}