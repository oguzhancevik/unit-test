package io.github.oguzhancevik.calculator;

import io.github.oguzhancevik.unittest.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void sum(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.sum(2,3));
    }

    @Test
    public void subtract(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(10, calculator.subtract(20, 10));
    }



}
