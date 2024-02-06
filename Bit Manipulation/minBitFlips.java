// 2220. Minimum Bit Flips to Convert Number

class Solution {
    public int minBitFlips(int start, int goal) {
        int n = start^goal;
        int c = 0;
        while(n!=0){
            n&=(n-1);
            c++;
        }
        return c;
    }
}