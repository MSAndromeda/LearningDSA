// https://leetcode.com/problems/kth-missing-positive-number/

// 1539. Kth Missing Positive Number

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0, r = arr.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid]-mid-1<k) l = mid + 1;
            else r = mid - 1;
        }
        return k+l;
    }
}