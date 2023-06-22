package customer;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
  private Repository repository;

  public CustomerService(Repository repository) {
    this.repository = repository;
  }

  public List<Customer> getCustomersByCity(String city) {
    return repository.findAll()
        .stream()
        .filter(c -> c.getCity().equalsIgnoreCase(city))
        .collect(Collectors.toList());
  }
}
