package com.manas;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SumTriangles {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        SumTriangle(arr);
    }
    public static void SumTriangle(int[] arr){
        if(arr.length < 1) {
            return;
        }
        int len = arr.length-1;
        int[] temp = new int[len];
        for(int i = 0; i < len; i++){
            int x = arr[i]+arr[i+1];
            temp[i] = x;
        }
        SumTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
}
