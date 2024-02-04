// 405. Convert a Number to Hexadecimal

class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        StringBuilder hexRep = new StringBuilder();
        while(num != 0){
            int n = num & 15;
            if(n < 10) hexRep.append(n);
            else hexRep.append((char)('a' + (n - 10)));
            num >>>= 4;
        }
        return hexRep.reverse().toString();
    }
}