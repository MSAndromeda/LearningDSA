// 1342. Number of Steps to Reduce a Number to Zero

class Solution {
    public int numberOfSteps(int num) {
        return (num == 0)? 0 : (int)(Math.log(num)/Math.log(2)) + setbits(num);
    }
    private int setbits(int n){
        int c = 0;
        while(n!=0){
            c++;
            n &= (n-1);
        }
        return c;
    }
}