package com.begin.examples;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println(divide(5,0));
    }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by Zero");
        }
        return a/b;
    }
}
