package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {

    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public void  testSumCalculatorWithN1(){
        int sum = sumCalculator.sum(1);
        int result = 1;
        Assertions.assertEquals(result, sum);
    }
    @Test
    public void  testSumCalculatorWithN6(){
        int sum = sumCalculator.sum(3);
        int result = 6;
        Assertions.assertEquals(result, sum);
    }
    @Test
    public void  testSumCalculatorWithZero(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> sumCalculator.sum(0));
    }
}

