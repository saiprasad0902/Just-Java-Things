package com.prasad.learnings;

public class ExceptionTest {
    public ExceptionTest() {
    }

    public void someMathTest() {
        try {
            int var1 = 10 / 0;
        } finally {
            System.exit(0);
        }

    }
}
