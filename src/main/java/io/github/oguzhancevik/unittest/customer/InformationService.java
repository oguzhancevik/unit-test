package io.github.oguzhancevik.unittest.customer;

import io.github.oguzhancevik.unittest.MailServerUnavailableException;

public class InformationService {

  public void sendMailForNewCustomer(Customer customer) {
    System.out.println("Sent mail!");
  }

  public void sendWeeklyMail() {
    throw new MailServerUnavailableException("Mail failed!");
  }
}
