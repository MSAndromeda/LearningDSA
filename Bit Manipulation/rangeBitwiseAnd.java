// Bitwise AND of Numbers Range

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==0) return 0;
        if(log2(left) != log2(right)) return 0;
        while(right>left) right &= (right-1);
        return (left&right);
    }
    private int log2(int n){
        return (int)(Math.log(n)/Math.log(2));
    }
}