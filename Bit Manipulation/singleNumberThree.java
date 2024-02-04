// 260. Single Number III

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int temp = 0;
        for(int x : nums){
            temp ^= x;
        }
        temp &= -temp;
        for(int x : nums){
            if((x&temp) == 0) res[0] ^= x;
            else res[1] ^= x;
        }
        return res;
    }
}