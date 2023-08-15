package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 2: Creating an object of the Product class
        Product p = new Product();
        p.product(1,2);
        p.product(1,2,3);
        p.product(2.00,3.00);

        // Now you can work with the 'p' object as needed
    }
    public static class Product{

        public int product(int x, int y) {
//            System.out.println("first product");
            return x+y;
        }
        public int product(int x, int y, int z) {
//            System.out.println("second product");
            return x+y+z;
        }
        public double product(double x, double y) {
//            System.out.println("third product");
            return x+y;
        }
    }


}