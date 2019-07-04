package io.github.oguzhancevik.unittest.customer;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CustomerServiceTest {

    private CustomerService customerService;
    private CustomerRepository customerRepository;
    private InformationService informationService;

  @Before
  public void setUp() throws Exception {
      customerService = new CustomerService();
      customerRepository = Mockito.mock(CustomerRepository.class);
      informationService = Mockito.mock(InformationService.class);
      customerService.setCustomerRepository(customerRepository);
      customerService.setInformationService(informationService);
  }

    @Test
    public void saveCustomer(){
      Customer customer = new Customer();
      customerService.saveCustomer(customer);

      // check
        Mockito.verify(informationService).sendMailForNewCustomer(customer);
        Mockito.verify(customerRepository).save(customer);


    }

}