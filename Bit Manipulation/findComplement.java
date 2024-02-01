// 476. Number Complement

class Solution {
    public int findComplement(int num) {
       int bitmask = (1 << ((int)((Math.log(num)/Math.log(2))+1))) - 1;
       return (num^bitmask);
    }
}