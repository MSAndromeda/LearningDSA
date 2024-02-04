// 2859. Sum of Values at Indices With K Set Bits

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res = 0;
        for(int i = 0; i < nums.size(); i++){
            if(setBits(i)==k) res += nums.get(i);
        }
        return res;
    }
    private int setBits(int n){
        int c = 0;
        while(n!=0){
            c++;
            n &= (n-1);
        }
        return c;
    }
}