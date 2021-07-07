package com.prasad.learnings.coding;

public class IsVowel {
    public static void main(String[] args) {
        String str = "Hll";
        System.out.println(str.toLowerCase().matches(".*[aeiou].*"));
    }
}
