// https://leetcode.com/problems/arranging-coins/

// 441. Arranging Coins
class Solution {
    public int arrangeCoins(int n) {
        if( n <= 3) return (n == 3)?2:1;
        long start = 1, end = n/2;
        while(start<=end){
            long mid = start + (end-start)/2;
            long coins = (mid*(mid+1))/2;
            if( coins == n)
                return (int)mid;
            if( coins < n)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return (int)end;
    }
}
