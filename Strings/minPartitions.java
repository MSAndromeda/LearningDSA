// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/

// 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers

class Solution {
    public int minPartitions(String n) {
        int len = n.length(), minnum = 0;
        for(int i = 0; i < len; i++){
            if(n.charAt(i)>minnum+'0') minnum = n.charAt(i) - '0';
        }
        return minnum;
    }
}