package customer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

  @InjectMocks
  CustomerService service;

  @Mock
  Repository repository;

  @Test public void
  should_return_customers_by_city() {

    when(repository.findAll()).thenReturn(Arrays.asList(
        new Customer("1", "Fake name", "Fake city")));

    List<Customer> customers = service.getCustomersByCity("Fake city");

    verify(repository, times(1)).findAll();
  }
}