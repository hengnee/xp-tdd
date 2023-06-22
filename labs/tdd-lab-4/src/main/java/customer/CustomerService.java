package customer;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {

  private final Repository repository;

  public CustomerService(Repository repository) {
    this.repository = repository;
  }
//  private final DbRepository repository = new DbRepository();

  public List<Customer> getCustomersByCity(String city) {
    return repository.findAll()
        .stream()
        .filter(c -> c.getCity().equalsIgnoreCase(city))
        .collect(Collectors.toList());
  }
}
