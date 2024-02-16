// https://leetcode.com/problems/valid-perfect-square/

// 367. Valid Perfect Square

class Solution {
    public boolean isPerfectSquare(int num) {
        int closeSq = binarySearch(num);
        return (closeSq*closeSq == num);
    }
    private int binarySearch(int n){
        int left = 1, right = n;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(mid>n/mid) right = mid - 1;
            else if(mid<n/mid) left = mid + 1;
            else return mid;
        }
        return 0;
    }
}