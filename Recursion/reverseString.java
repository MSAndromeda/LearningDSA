// https://leetcode.com/problems/reverse-string/

// 344. Reverse String

class Solution {
    public void reverseString(char[] s) {
        ReverseRecur(s, 0, s.length-1);
    }
    public void ReverseRecur(char[] arr, int s, int e){
        if(s>e) return;
        char temp = arr[s];
        arr[s++] = arr[e];
        arr[e--] = temp;
        ReverseRecur(arr, s, e);
    }
}