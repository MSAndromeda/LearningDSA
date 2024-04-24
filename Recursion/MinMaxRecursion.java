package com.manas;

public class MinMaxRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(minimumEle(arr, arr.length));
        System.out.println(maximumEle(arr, arr.length));
    }
    public static int minimumEle(int[] arr, int n){
        if(n==1) return arr[0];
        return Math.min(arr[n-1], minimumEle(arr,n-1));
    }
    public static int maximumEle(int[] arr, int n) {
        if(n==1) return arr[0];
        return Math.max(arr[n-1], maximumEle(arr, n-1));
    }
}
