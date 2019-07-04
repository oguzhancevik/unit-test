package io.github.oguzhancevik.junit;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

  @Test
  public void assertEquals() throws Exception {
    Dummy d1 = new Dummy(5);
    Dummy d2 = new Dummy(5);
    Assert.assertEquals(d1, d2);
  }

  @Test
  public void assertSame() throws Exception {
    Dummy d1 = new Dummy(5);
    Dummy d2 = d1;
    Assert.assertSame("d1 and d2 are equals", d1, d2);
  }

  @Test
  public void assertNull() throws Exception {
    Dummy d1 = null;
    Assert.assertNull(d1);
  }

  @Test
  public void assertNotNull() throws Exception {
    Dummy d1 = new Dummy(5);
    Assert.assertNotNull(d1);
  }

  @Test
  public void assertArrayEquals() throws Exception {
    int[] arr1 = new int[] {1, 2};
    int[] arr2 = new int[] {1, 2};
    Assert.assertArrayEquals(arr1, arr2);
  }

  private static class Dummy {
    private int id;

    public Dummy(int id) {
      this.id = id;
    }

    public int getId() {
      return id;
    }

    @Override
    public boolean equals(Object obj) {
      return this.id == ((Dummy) obj).getId();
    }
  }
}
