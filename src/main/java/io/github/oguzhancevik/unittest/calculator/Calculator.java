package io.github.oguzhancevik.unittest.calculator;

public class Calculator {

  public int sum(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int subtractFromZero(int number) {
    return 0 - number;
  }

  public int calculateSquareMeter(int width, int height) {
    return width * height;
  }
}
