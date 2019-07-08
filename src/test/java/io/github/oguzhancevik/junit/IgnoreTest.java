package io.github.oguzhancevik.junit;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {

  @Test
  public void testHello() throws Exception {
    System.out.println("Hello");
  }

  @Test
  @Ignore("this method works other time")
  public void testHello2() throws Exception {
    System.out.println("Hello2");
  }
}
