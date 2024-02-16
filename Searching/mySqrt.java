// https://leetcode.com/problems/sqrtx/description/

// 69. Sqrt(x)

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int left = 0, right = x;
        while(right>=left){
            int mid = left + (right-left)/2;
            if(mid > x/mid){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return right;
    }
}