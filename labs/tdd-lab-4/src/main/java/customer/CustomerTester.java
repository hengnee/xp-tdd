package customer;

import java.util.List;

public class CustomerTester {

  public static void main(String[] args) {
    CustomerService service = new CustomerService(new DbRepository());

    List<Customer> customers = service.getCustomersByCity("New Delhi");

    System.out.println(customers);
  }
}
