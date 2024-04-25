package com.manas;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 0, 7, 5};
        RecurSort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void RecurSort(int[] arr, int r, int c, int max) {
        if(r==0) {
            return;
        }
        if(c<=r){
            if(arr[c]>arr[max]){
                RecurSort(arr, r, c+1, c);
            }else{
            RecurSort(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[c-1];
            arr[c-1] = temp;
            RecurSort(arr, r-1, 0, 0);
        }
    }
}
