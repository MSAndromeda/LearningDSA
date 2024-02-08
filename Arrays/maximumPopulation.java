// https://leetcode.com/problems/maximum-population-year/description/

// 1854. Maximum Population Year

class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] maxpop = new int[101];
        for(int[] log : logs){
            maxpop[log[0]-1950]++;
            maxpop[log[1]-1950]--;
        }
        int maxyear = 1950;
        int max = maxpop[0];
        for(int i = 1; i < 101; i++){
            maxpop[i] += maxpop[i-1];
            if(maxpop[i]>max){
                maxyear = i+1950;
                max = maxpop[i];
            }
        }
        return maxyear;
    }
}