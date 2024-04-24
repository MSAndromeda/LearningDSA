// https://leetcode.com/problems/binary-search/

// 704. Binary Search

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        return BinarySearch(nums, target, start, end);
    }
    public int BinarySearch(int[] arr, int target, int s, int e){
        if(s>e) return -1;
        int mid = s + (e - s)/2;
        if(arr[mid] == target) return mid;
        if(arr[mid]>target){
            return BinarySearch(arr, target, s, mid-1);
        }
        return BinarySearch(arr, target, mid+1, e);
    }
}