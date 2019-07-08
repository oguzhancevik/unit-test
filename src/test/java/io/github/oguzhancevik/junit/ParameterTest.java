package io.github.oguzhancevik.junit;

import io.github.oguzhancevik.unittest.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ParameterTest {

  Calculator calculator = new Calculator();
  private int width;
  private int height;
  private int totalSquareMeter;

  @Parameterized.Parameters
  private static Collection<Object[]> data() {
    return Arrays.asList(
        new Object[][] {
          {10, 2, 20},
          {20, 3, 60},
          {10, 3, 30},
        });
  }

  @Test
  public void calculateSquareMeter() {
    Assert.assertEquals(totalSquareMeter, calculator.calculateSquareMeter(width, height));
  }
}
