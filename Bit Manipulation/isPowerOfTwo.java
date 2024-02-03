// 231. Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n<1)?false:((n&(n-1))==0);
    }
}