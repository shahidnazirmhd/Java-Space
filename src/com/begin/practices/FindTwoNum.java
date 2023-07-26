package com.begin.practices;

public class FindTwoNum {

    public static void findTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Sum found: " + arr[i] + " + " + arr[j] + " = " + target);
                    return;
                }
            }
        }
        System.out.println("No two elements found that sum up to the target value.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int targetValue = 6;

        findTwoSum(arr, targetValue);
    }
}
