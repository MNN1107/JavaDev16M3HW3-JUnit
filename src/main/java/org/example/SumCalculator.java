package org.example;

public class SumCalculator {
    public  int sum (int n){
        int result = n*(n+1)/2;
        if (n <= 0){
            throw new IllegalArgumentException("n must be a positive integer");
        }
        return result;
    }

}
