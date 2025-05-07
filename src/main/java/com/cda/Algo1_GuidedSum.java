package com.cda;

public class Algo1_GuidedSum {
    public static int safeAdd(int a, int b) {
        if (a > Integer.MAX_VALUE - b) {
            throw new ArithmeticException("Overflow");
        }
        return a + b;
    }
}