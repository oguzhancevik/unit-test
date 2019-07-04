package io.github.oguzhancevik.unittest.customer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CustomerServiceTest {

  private CustomerService customerService;
  private CustomerRepositoryStub customerRepository = new CustomerRepositoryStub();;
  private InformationService informationService;

  @Before
  public void setUp() throws Exception {
    customerService = new CustomerService();
    informationService = Mockito.mock(InformationService.class);
    customerService.setCustomerRepository(customerRepository);
    customerService.setInformationService(informationService);
  }

  @Test
  public void saveCustomer() {
    Customer customer = new Customer();
    customer.setId(1234);
    customerService.saveCustomer(customer);

    // check
    Mockito.verify(informationService).sendMailForNewCustomer(customer);
    Assert.assertTrue(customerRepository.getCustomers().containsValue(customer));
    //Mockito.verify(customerRepository).save(customer);
  }

  @Test
  public void find(){
    Customer customer = new Customer();
    customer.setId(6500);
    customerService.saveCustomer(customer);

    Assert.assertEquals(customer, customerRepository.find(6500));

  }

  @Test
  public void remove(){
    customerService.delete(6500);
    Assert.assertNull(customerRepository.find(6500));
  }

}
