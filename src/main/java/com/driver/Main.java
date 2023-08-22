package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        p.product(1, 2);
        p.product(1, 2, 3);
        p.product(2.0, 3.0);
    }

    public static class Product {

        public int product(int x, int y) {
//            System.out.println("first product");
            return x * y;
        }

        public int product(int x, int y, int z) {
//            System.out.println("second product");
            return x * y * z;
        }

        public double product(double x, double y) {
//            System.out.println("third product");
            return x * y;
        }
    }
}
