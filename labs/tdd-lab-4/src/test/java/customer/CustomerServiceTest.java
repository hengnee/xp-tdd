package customer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {
    // should_be_able_to_get_list_of_customer_by_city_when_input_city_is_found
    // should return NullPointerException when input city is null
    // should return empty customer when input city is empty
    // should return empty when repository is empty
    @Mock
    Repository repository;
    @InjectMocks
    CustomerService customerService;

    @Test public void
    should_be_able_to_get_list_of_customer_by_city_when_input_city_is_found() {
        String inputCity = "Singapore";
        List<Customer> customers = List.of(new Customer("0", "my name", "Singapore"));
        when(repository.findAll()).thenReturn(customers);
        List<Customer> foundCustomers = customerService.getCustomersByCity(inputCity);
        assertArrayEquals(customers.toArray(), foundCustomers.toArray());
    }

}