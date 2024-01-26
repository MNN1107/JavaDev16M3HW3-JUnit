package org.example;

public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println ("sumCalculator N1 = " + sumCalculator.sum(1));
        System.out.println ("sumCalculator N3 = " + sumCalculator.sum(3));
        System.out.println ("sumCalculator zero = " + sumCalculator.sum(0));
    }
}