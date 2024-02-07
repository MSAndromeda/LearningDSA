// https://leetcode.com/problems/find-the-highest-altitude/description/

// 1732. Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int highestalt = gain[0];
        for(int i = 1; i < gain.length; i++){
            gain[i] += gain[i-1];
            if(gain[i]>highestalt) highestalt = gain[i]; 
        }
        return (highestalt>0)?highestalt:0;
    }
}