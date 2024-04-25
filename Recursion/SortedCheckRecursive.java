package com.manas;

public class SortedCheckRecursive {
    public static void main(String[] args) {
        int[] arr = {12, 14, 4, 15, 16, 17, 25, 35, 68};
        System.out.println(SortChecker(arr, 0));
    }

    private static boolean SortChecker(int[] arr,int i) {
        if(i == arr.length-1) return true;
        return (arr[i]<arr[i+1]&&SortChecker(arr, ++i));
    }
}
