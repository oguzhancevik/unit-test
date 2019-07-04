package io.github.oguzhancevik.junit;

import io.github.oguzhancevik.unittest.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(JUnitParamsRunner)
public class AssertSimpleTest {

    private Calculator calculator = new Calculator();

    @Test
    @Parameterized.Parameters("10, 20, 30")
    public void calculateSquareMeter(int width, int height, int totalSquareMeter){
        Assert.assertEquals(totalSquareMeter, calculator.calculateSquareMeter(width, height));
        org.junit.runner.J
    }

}
