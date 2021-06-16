package com.prasad.learnings;

public class ConstructorChaining {
    public ConstructorChaining() {
        this("Test");
        System.out.println("Test2");
    }

    public ConstructorChaining(String randomString) {
        System.out.println(randomString);
    }

    public static void main(String[] args) {
        new ConstructorChaining();
    }
}
