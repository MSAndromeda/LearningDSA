// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

// 1832. Check if the Sentence Is Pangram

class Solution {
    // Using a boolean array
    public boolean checkIfPangram1(String sentence) {
        if(sentence.length()<26) return false;
        boolean[] alpha = new boolean[26];
        for(int i = 0; i < sentence.length(); i++){
            alpha[(int)(sentence.charAt(i)-'a')] = true;
        }
        for(boolean x : alpha){
            if(x == false) return false;
        }
        return true;
    }

    // using bitmask 
    public boolean checkIfPangram2(String sentence) {
        int seen = 0;
        for(char c : sentence.toCharArray()) {
            int ci = c - 'a';
            seen = seen | (1 << ci);
        }
        return seen == ((1 << 26) - 1);
    }
}