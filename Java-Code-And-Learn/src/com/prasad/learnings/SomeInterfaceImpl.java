package com.prasad.learnings;

public class SomeInterfaceImpl implements SomeInterface {
    int test = 10;

    public SomeInterfaceImpl() {
    }

    public void testVoidMethod() {
    }

    public int testIntMethod() {
        return 0;
    }

    static void testStaticMethod() {
        System.out.println("from SomeInterfaceImpl");
    }
}
