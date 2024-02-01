// 2980. Check if Bitwise OR Has Trailing Zeros

class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int c = 0;
        for(int n : nums){
            if((n&1)==0) c++;
            if(c==2) break;
        }
        return (c==2);
    }
}