package com.manas;

public class LengthofString {
    public static void main(String[] args) {
        String str = "manas";
        System.out.println(LengthStr(str));
    }
    public static int LengthStr(String str){
        if(str.equals("")) return 0;
        return LengthStr(str.substring(1))+1;
    }
}
