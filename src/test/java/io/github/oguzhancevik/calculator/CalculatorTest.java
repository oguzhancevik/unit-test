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

    @Test
    public void subtractFromZero(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(-5, calculator.subtractFromZero(5));
    }

    @Test
    public void givenWhenThen(){
        // Given
        Calculator calculator = new Calculator();
        int number1 = 5;
        int number2 = 10;

        // When
        int sum = calculator.sum(number1, number2);

        // Then
        Assert.assertEquals(15, sum);
    }



}
