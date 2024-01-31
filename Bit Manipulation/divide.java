// 29. Divide Two Integers

class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        boolean isPositive = ((dividend<0)==(divisor<0));
        long res = 0;
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        while(a >= b){
            long temp = b, multiple = 1;
            while (a >= temp) {
                temp <<= 1;
                multiple <<= 1;
            }
            res += multiple >> 1;
            a -= temp >> 1;
        }
        if((res > Integer.MAX_VALUE)&& isPositive) return Integer.MAX_VALUE;
        return (int)(isPositive? res : -res);
    }
}