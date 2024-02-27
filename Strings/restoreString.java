// https://leetcode.com/problems/shuffle-string/

// 1528. Shuffle String

class Solution {
    public String restoreString(String s, int[] indices) {
        int indilen = indices.length;
        char[] shuffled = new char[indilen];
        for(int i = 0; i < indilen; i++){
            shuffled[indices[i]] = s.charAt(i);
        }
        return String.valueOf(shuffled);
    }
}