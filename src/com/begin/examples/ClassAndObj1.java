package com.begin.examples;

public class ClassAndObj1 {
    public static void main(String[] args) {
       Mobile newMobile = new Mobile("Nokia", "3", false);
        System.out.println("Smart Phone: "+ newMobile.brand +" "+ newMobile.model +"  5G Available: "+ newMobile.is5G);

        Mobile newMobile2 = new Mobile("Motorola", "G5", true);
        System.out.println("Smart Phone: "+ newMobile2.brand +" "+ newMobile2.model +"  5G Available: "+ newMobile2.is5G);

        ClassAndObj1 obj1 = new ClassAndObj1();
    }

    public static class Mobile {
        String brand;
        String model;
        boolean is5G;

        public Mobile(String brand, String model, boolean is5G) {
            this.brand = brand;
            this.model = model;
            this.is5G = is5G;
        }
    }

}
