// https://leetcode.com/problems/find-the-original-array-of-prefix-xor/

// 2433. Find The Original Array of Prefix Xor

class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length == 1) return pref;
        int len = pref.length;
        int[] result = new int[len];
        result[0] = pref[0];
        for(int i = 1; i < len; i++){
            result[i] = pref[i-1]^pref[i];
        }
        return result;
    }
}