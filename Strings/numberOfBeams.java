// https://leetcode.com/problems/number-of-laser-beams-in-a-bank/

// 2125. Number of Laser Beams in a Bank

class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank[0].length(), beams = 0, prev = 0, count = 0;
        for(String row : bank){
            count = deviceCount(row, n);
            if(count!=0){
                beams += prev*count;
                prev = count;
            }
        }
        return beams;
    }
    private int deviceCount(String row, int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(row.charAt(i)=='1') count++;
        }
        return count;
    }
}