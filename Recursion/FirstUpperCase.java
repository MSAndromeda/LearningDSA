package com.manas;

public class FirstUpperCase {
    public static void main(String[] args) {
        String str = "manasanandsingH";
        System.out.println(firstUpper(str, 0, str.length()));
    }

    private static char firstUpper(String str, int i, int n) {
        if(i==n) return 0;
        if(Character.isUpperCase(str.charAt(i))) return str.charAt(i);
        return firstUpper(str, i+1, n);
    }
}
