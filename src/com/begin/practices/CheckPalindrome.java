package com.begin.practices;

import java.util.Scanner;

public class CheckPalindrome {
    String org, rev ="";
    public void isPalindrome() {
        System.out.print("Enter the String: ");
        Scanner in = new Scanner(System.in);
        org = in.next();
        int len = org.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + org.charAt(i);
        }
        if (rev.equals(org)) {
            System.out.println("\nIt is a palindrome");
            rev = "";
        } else {
            System.out.println("\nIt is Not a palindrome");
            rev = "";
        }
    }
    public static void main(String[] args) {
        CheckPalindrome obj = new CheckPalindrome();
        while (true) {
            obj.isPalindrome();
        }
    }
}
