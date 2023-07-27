package com.begin.practices;

import java.util.Arrays;

public class ArraySort {
    static String  sortArray(int[] num) {
        Arrays.sort(num);
        return Arrays.toString(num);
    }
    static String sortArray(String[] str) {
        Arrays.sort(str);
        return Arrays.toString(str);
    }

    public static void main(String[] args) {
        int[] numArray = {4,8,97,2,5,1,11,10,3,6,5};
        String[] strArray = {"banana", "orange", "pine", "grapes", "Apples"};
        System.out.println(sortArray(numArray));
        System.out.println(sortArray(strArray));
    }
}
