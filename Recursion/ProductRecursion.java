package com.manas;

public class ProductRecursion {
    public static void main(String[] args) {
        int x = 5, y = 20;
        System.out.println(ProdSumRec(x, y));
    }

    private static int ProdSumRec(int x, int y) {
        if(x < y) return ProdSumRec(y, x);
        else if(y!=0) return x + ProdSumRec(x, --y);
        return 0;
    }
}
