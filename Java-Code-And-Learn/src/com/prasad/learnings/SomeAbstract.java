package com.prasad.learnings;

public abstract class SomeAbstract {
    private int testPrivateVar = 10;

    public SomeAbstract() {
    }

    private void setTestPrivateMethod() {
        System.out.println("Private");
    }

    public void setTestPublicVariable() {
        System.out.println("Public");
    }
}
