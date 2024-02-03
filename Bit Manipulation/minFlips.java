// 1318. Minimum Flips to Make a OR b Equal to c

class Solution {
    public int minFlips(int a, int b, int c) {
        return setbitcount(((a|b)^c))+setbitcount(a&b&((a|b)^c));
    }
    private int setbitcount(int n){
        int c = 0;
        while(n!=0){
            n &= (n-1);
            c++;
        }
        return c;
    }
}