// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/

// 1769. Minimum Number of Operations to Move All Balls to Each Box

class Solution {
    public int[] minOperations(String boxes) {
        // int len = boxes.length();
        // int[] result = new int[len];
        // for(int i = 0; i < len; i++){
        //     for(int j = 0; j < len; j++){
        //         result[i] += (boxes.charAt(j) - '0')*(Math.abs(j-i));
        //     }
        // }
        // return result;
        int len = boxes.length();
        int[] minimum = new int[len];
        for(int i = 0, count = 0, opr = 0; i < len; i++){
            minimum[i] += opr;
            count += boxes.charAt(i) - '0';
            opr += count;
        }
        for(int i = len - 1, count = 0, opr = 0; i >= 0; i--){
            minimum[i] += opr;
            count += boxes.charAt(i) - '0';
            opr += count;
        }
        return minimum;
    }
}