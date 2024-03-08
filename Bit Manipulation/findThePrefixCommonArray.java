// https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/

// 2657. Find the Prefix Common Array of Two Arrays

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length, count = 0;
        int[] C = new int[n];
        int[] occ = new int[n+1];
        for(int i = 0; i < n; i++){
            if(++occ[A[i]] == 2) count++;
            if(++occ[B[i]] == 2) count++;
            C[i] = count;
        }
        return C;
    }
}