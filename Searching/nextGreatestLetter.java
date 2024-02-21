// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

// 744. Find Smallest Letter Greater Than Target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int arrlen = letters.length;
        int start = 0, end = arrlen - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(letters[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start%arrlen];
    }
}