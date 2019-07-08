package io.github.oguzhancevik.unittest.customer;

import io.github.oguzhancevik.unittest.MailServerUnavailableException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

  @Rule public ExpectedException thrown = ExpectedException.none();
  private InformationService informationService = new InformationService();

  @Test
  public void testTryCatchException() {
    try {
      informationService.sendWeeklyMail();
    } catch (Exception exc) {
      Assert.assertTrue(exc instanceof MailServerUnavailableException);
    }
  }

  @Test
  public void testTryCatchException2() {
    try {
      informationService.sendWeeklyMail();
    } catch (Exception exc) {
      Assert.assertEquals("Mail failed!", exc.getMessage());
    }
  }

  @Test(expected = MailServerUnavailableException.class)
  public void testExpectedException() {
    informationService.sendWeeklyMail();
  }

  @Test
  public void testRuleException() throws Exception {
    thrown.expect(MailServerUnavailableException.class);
    thrown.expectMessage("Mail failed!");
    informationService.sendWeeklyMail();
  }
}
