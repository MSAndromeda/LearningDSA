// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/

// 1304. Find N Unique Integers Sum up to Zero

class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        for(int i = 1; i <= n/2; i++){
            res[i-1] = i;
            res[n-i] = -1*i;
        }
        return res;
    }
}