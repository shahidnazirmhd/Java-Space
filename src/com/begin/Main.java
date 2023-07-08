package com.begin;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hi, How are you?");
//        String word = "Shahid";
//        int num = 100;
//        String str = new String("My Name is Shahid");
//        System.out.println(str);
//        System.out.println(LocalDate.now());
//        LocalDate date = LocalDate.now();
//        System.out.println(date.getMonth());
//        Date sqlDate = new Date(2);
//        System.out.println(sqlDate);
//        char letter;
//        System.out.println("Choose One Option from following: A  B  C");
//        System.out.print("Enter Option ");
//        Scanner input = new Scanner(System.in);
//        letter = input.next().charAt(0);
//        switch (letter) {
//            case 'a': System.out.println("Option A selected");
//            break;
//            case 'b': System.out.println("Option B selected");
//            break;
//            case 'c': System.out.println("Option C selected");
//            break;
//            default: System.out.println("Option Not exist");
//        int [] num = {34, 43, 56, 65, 55, 77, 67};
//        Arrays.stream(num).forEach(System.out::println);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your age:");
//        int age = input.nextInt();
//        System.out.println("You are born on "+LocalDate.now().minusYears(age).getYear());
//        int num =10;
//        System.out.println(num+++num);
//        System.out.println(num);
//            int num = 10;
//            //int num2 = ++num;
//        int num2 = increment(num);
//        System.out.println(num);
//        System.out.println(num2);
//        }
//        static int increment(int value){
//            return ++value;

//        int[] num = {2, 4, 5, 6,};
//        String res = Arrays.toString(num);
//        System.out.println(res.length());
//        System.out.println(res);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Your Monthly Rental Income: ");
//        double monthlyIncome = input.nextDouble();
//        System.out.print("Enter Your Original Property Value: ");
//        double propertyValue = input.nextDouble();
//        System.out.println("You Entered "+monthlyIncome+" : "+propertyValue);
//        calcRentalYield(monthlyIncome, propertyValue);
//      }
//      private static void calcRentalYield(double monthlyIncome, double propertyValue) {
//          double yearlyIncome = monthlyIncome * 12;
//          double percentOfYield = (yearlyIncome / propertyValue) * 100;
//          System.out.println("Your Rental yield is "+percentOfYield+"%");

//        System.out.println(ZonedDateTime.now());
        double n1 = 0.02;
        double n2 = 0.03;
        double res = n2 - n1;
        System.out.println(res);

        BigDecimal num1 = new BigDecimal("0.02");
        BigDecimal num2 = new BigDecimal("0.03");
        System.out.println(num2.subtract(num1));
   }
    }

