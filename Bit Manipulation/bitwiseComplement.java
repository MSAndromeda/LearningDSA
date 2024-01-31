// 1009. Complement of Base 10 Integer

class Solution {
    public int bitwiseComplement(int n) {
        int bitmask = (1 << (int)(Math.log(n)/Math.log(2)+1)) - 1;
        return (n==0)? 1 : n^bitmask;
    }
}