package com.prasad.learnings;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        ReflectionTest reflectionTest = new ReflectionTest();
        Method method = reflectionTest.getClass().getMethod("testReflection", (Class[])null);
        method.invoke(reflectionTest, (Object[])null);
    }

    public static class Test {
        public Test() {
        }

        public int cal(int a, int b) {
            try {
                int var10000;
                try {
                    var10000 = a - b;
                } catch (Exception var9) {
                    var10000 = a + b;
                }
            } finally {
                return a * b;
            }
        }
    }
}
