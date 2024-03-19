// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/

// 2037. Minimum Number of Moves to Seat Everyone

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int minmove = 0;
        for(int i = 0; i < seats.length; i++){
            minmove += Math.abs(seats[i]-students[i]);
        }
        return minmove;
    }
}