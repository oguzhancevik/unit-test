package io.github.oguzhancevik.unittest.customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryStub extends CustomerRepository {

  private Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

  @Override
  public void save(Customer customer) {
    customers.put(customer.getId(), customer);
  }

  @Override
  public void delete(Integer id) {
    customers.remove(id);
  }

  @Override
  public Customer find(Integer id) {
    return customers.get(id);
  }

  public Map<Integer, Customer> getCustomers() {
    return customers;
  }

  public void deleteAllCustomers() {
    customers.clear();
  }
}
