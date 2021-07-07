package com.prasad.learnings.coding;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a : " +a);
        System.out.println("b : " +b);

        b = b + a; // 30
        a = b - a;  // 20
        b = b- a; // 10

        System.out.println("a : " +a);
        System.out.println("b : " +b);


    }
}
