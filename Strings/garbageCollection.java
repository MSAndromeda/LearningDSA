// https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/

// 2391. Minimum Amount of Time to Collect Garbage

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int result = 0, garlen = garbage.length, tralen = travel.length;
        for(int i = 0; i < garlen; i++){
            result += garbage[i].length();
        }
        int[] position = new int[3];
        for(int i = 0; i < garlen; i++){
            if(garbage[i].contains("M")) position[0] = i;
            if(garbage[i].contains("P")) position[1] = i;
            if(garbage[i].contains("G")) position[2] = i;
        }
        for(int i = 1; i < tralen; i++){
            travel[i] += travel[i-1];
        }
        for(int i = 0; i < 3; i++){
            if(position[i] == 0) continue;
            result += travel[position[i]-1];
        }
        return result;
    }
}