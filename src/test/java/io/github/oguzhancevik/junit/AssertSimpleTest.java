package io.github.oguzhancevik.junit;

import io.github.oguzhancevik.unittest.calculator.Calculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class AssertSimpleTest {

  private Calculator calculator = new Calculator();

  @Test
  @Parameters({"10, 2, 20", "3, 30, 90"})
  public void calculateSquareMeter(int width, int height, int totalSquareMeter) throws Exception {
    Assert.assertEquals(totalSquareMeter, calculator.calculateSquareMeter(width, height));
  }
}
