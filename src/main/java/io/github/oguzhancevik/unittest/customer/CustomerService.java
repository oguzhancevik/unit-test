package io.github.oguzhancevik.unittest.customer;

public class CustomerService {

  private CustomerRepository customerRepository;
  private InformationService informationService;

  public void saveCustomer(Customer customer) {
    customerRepository.save(customer);
    informationService.sendMailForNewCustomer(customer);
  }

  public void delete(Integer id){
    customerRepository.delete(id);
  }

  public void setCustomerRepository(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public void setInformationService(InformationService informationService) {
    this.informationService = informationService;
  }
}
