package com.prasad.learnings.coding;

public class isPrime {
    public static void main(String[] args) {
        int num = (int) 2147483647;
        if(num == 2 || num == 3){
            System.out.println("true");
            return;
        }
        if (num % 2 ==  0){
            System.out.println("false");
        }
        else {
            int sqt = (int) Math.sqrt(num);
            for(int i = 3;i< sqt; i+=2){
                if(num % i == 0){
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        }
    }


}
