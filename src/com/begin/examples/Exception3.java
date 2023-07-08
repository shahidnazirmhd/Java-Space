package com.begin.examples;

public class Exception3 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(5, 0));
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }
    }
   /* public static int divide(int a, int b) {
        if (b == 0) {
            throw new MyUncheckedException("Cannot divide by Zero");
        }
        return a/b;
    }

    */
   public static int divide(int a, int b) throws MyCheckedException{
       if (b == 0) {
           throw new MyCheckedException("Cannot divide by Zero");
       }
       return a/b;
   }
}
