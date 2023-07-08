package com.begin.examples;

public class Exception2 {
    public static void main(String[] args) /* throws Exception */ {
        try {
            System.out.println(divide(5,0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by Zero");
        }
        return a/b;
    }
}
