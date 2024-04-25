package com.manas;

public class DigiSumRecursive {
    public static void main(String[] args) {
        int n = 45632;
        System.out.println(RecSum(n));
    }

    private static int RecSum(int n) {
        if(n%10 == n) return n;
        return n%10 + RecSum(n/10);
    }
}
