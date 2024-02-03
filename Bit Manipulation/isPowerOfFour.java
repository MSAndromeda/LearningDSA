// 342. Power of Four

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1) return false;
        int mask = 0x55555555;
        return ((n&mask)==n)&&((n&(n-1))==0);
    }
}