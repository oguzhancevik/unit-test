package io.github.oguzhancevik.unittest.customer;

public class CustomerRepository {

  public void save(Customer customer) {
    System.out.println("Customer saved!");
  }

  public void delete(Integer id){
    System.out.println("Customer deleted!");
  }

  public Customer find(Integer id){
    System.out.println("Find Customer!");
    return null;
  }

}
