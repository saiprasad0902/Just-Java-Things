package com.prasad.learnings;

public class Human {
    int age;

    public Human(int age) {
        this.age = age;
    }

    public boolean walk() {
        return this.age > 10;
    }

    static void test() {
        System.out.println("Im a static method");
    }

    static void test(String str) {
        System.out.println("Im a static method" + str);
    }
}
