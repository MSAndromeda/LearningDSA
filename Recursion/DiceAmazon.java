package com.manas;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(recursive("", 4));
    }
    private static ArrayList<String> recursive(String p, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(recursive(p+i, target-i));
        }
        return list;
    }
}
