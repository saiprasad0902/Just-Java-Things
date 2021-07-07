package com.prasad.learnings.coding;

public class StringReverse {
    public static void main(String[] args) {
        String str = "abcd";
        if(!str.isEmpty()){
            System.out.println("inside");
            char[] values = str.toCharArray();
            for(int i=values.length-1; i>=0;i--){
                System.out.print(values[i]);
            }
        }
    }
}
