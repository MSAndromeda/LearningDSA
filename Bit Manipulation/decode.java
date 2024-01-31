// 1720. Decode XORed Array

class Solution {
    public int[] decode(int[] encoded, int first) {
        int en_len = encoded.length;
        int[] original = new int[en_len+1];
        original[0] = first;
        for(int i = 0; i < en_len; i++){
            original[i+1] = original[i]^encoded[i];
        }
        return original;
    }
}