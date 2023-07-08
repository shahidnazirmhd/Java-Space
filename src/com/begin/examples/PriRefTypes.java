package com.begin.examples;
// Difference between Primitive and Reference Data Type
public class PriRefTypes {
    public static void main(String[] args) {
        // Primitive
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = "+ a + " b = "+ b);
        // Reference
        Person p1 = new Person("Shahid");
        Person p2 = p1;
        System.out.println("Before changing the name");
        System.out.println(p1.name +" "+p2.name);
        p1.name = "Nazir";
        System.out.println("After changing the name");
        System.out.println(p1.name +" "+p2.name);
    }
    static class Person {
        String name;
        public Person(String n) {
            this.name = n;
        }
    }
}
