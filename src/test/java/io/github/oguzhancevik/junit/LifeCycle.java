package io.github.oguzhancevik.junit;

import org.junit.*;

public class LifeCycle {

  @BeforeClass
  public static void beforeClass() {
    System.out.println("@BeforeClass method");
  }

  @AfterClass
  public static void afterClass() {
    System.out.println("@AfterClass method");
  }

  @Before
  public void setUp() throws Exception {
    System.out.println("@Before method");
  }

  @After
  public void tearDown() throws Exception {
    System.out.println("@After method");
  }

  @Test
  public void printHelloWorld() {
    System.out.println("Hello World!");
  }

  @Test
  public void printTestToolBrand() {
    System.out.println("JUnit");
  }

  /**
   * -------Output------------- @BeforeClass method @Before method JUnit @After method @Before
   * method Hello World! @After method @AfterClass method -------Output-------------
   */
}
