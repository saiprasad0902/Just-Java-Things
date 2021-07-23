package com.prasad.learnings.coding;

public class StringPalindrome {
    public static void main(String[] args) {
        boolean isPalindrome = false;
        String strValue = "Bob";
        String strValueReverse = reverse(strValue);
        isPalindrome = strValue.toLowerCase().equals(strValueReverse.toLowerCase());
        System.out.println(isPalindrome);
    }

    private static String reverse(String input) {
        if(input == null || input.isEmpty()){ return input; }
        return input.charAt(input.length()- 1) +
                reverse(input.substring(0, input.length() - 1));
    }
}
