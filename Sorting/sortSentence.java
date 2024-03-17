// https://leetcode.com/problems/sorting-the-sentence/

// 1859. Sorting the Sentence

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for(int i = 0; i < words.length; i++){
            int lastcharind = words[i].length() - 1;
            int index = words[i].charAt(lastcharind) - '1';
            result[index] = words[i].substring(0,lastcharind);
        }
        return String.join(" ", result);
    }
}