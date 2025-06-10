package com.cda;

public class Algo1_GuidedSum {
    public static int safeAdd(int a, int b) {
        if (( b > 0 && a > Integer.MAX_VALUE - b)
            || ( b < 0 && a < - Integer.MAX_VALUE - b)) {
            throw new ArithmeticException("Overflow");
        }
        return a + b;
    }
}