// 2595. Number of Even and Odd Bits

class Solution {
    public int[] evenOddBit(int n) {
        int[] answer = new int[2];
        int flip = 0;
        while(n!=0){
            answer[flip] += n&1;
            flip = (flip==0)?1:0;
            n>>=1;
        }
        return answer;
    }
}