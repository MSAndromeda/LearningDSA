// https://leetcode.com/problems/neither-minimum-nor-maximum/

// 2733. Neither Minimum nor Maximum

class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = 101, max = 0;
        for(int num: nums){
            if(min>num) min = num;
            if(max<num) max = num;
        }
        for(int num: nums){
            if(num!=min && num!=max) return num;
        }
        return -1;
    }
}