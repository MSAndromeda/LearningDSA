// 762. Prime Number of Set Bits in Binary Representation

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for(int i = left; i <= right; i++){
            int sb = setBits(i);
            if(sb==2||sb==3||sb==5||sb==7||sb==11||sb==13||sb==17||sb==19) result++;
        }
        return result;
    }
    private int setBits(int n){
        int c = 0;
        while(n!=0){
            c++;
            n&=(n-1);
        }
        return c;
    }
}