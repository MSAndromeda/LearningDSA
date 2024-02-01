// 191. Number of 1 Bits

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c = 0;
        while(n!=0){
            c++;
            n&=(n-1);
        }
        return c;
    }
}