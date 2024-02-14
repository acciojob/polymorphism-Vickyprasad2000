package com.driver;

public class Main {
    public static void main(String args[])
    {
        Product p = new Product();
        p.product(10,20);
        p.product(100,200,300);
        p.product(2.50,5.50);
    }
    static class Product{
        public int product(int x, int y)
        {
            return x*y;
        }
        public int product(int x, int y,int z)
        {
            return x*y*z;
        }
        public double product(double x, double y)
        {
            return x*y;
        }
    }
}