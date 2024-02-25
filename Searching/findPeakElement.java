// https://leetcode.com/problems/find-peak-element/

// 162. Find Peak Element

class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length==1) return 0;
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid==arr.length-1 && arr[mid]>arr[mid-1]) return mid;
            else if(mid==0 && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid+1]) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}