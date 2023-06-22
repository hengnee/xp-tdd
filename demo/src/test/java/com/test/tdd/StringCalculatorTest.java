package com.test.tdd;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StringCalculatorTest {
  // TODO:
  // DONE The function should return zero when the input numbers is empty
  // DONE should return the same number when length is 1
  // DONE it can take any amount of numbers and returns the sum.
  // DONE The numbers are delimited by comma "," for e.g “1,2,3”
  // DONE and/or new line character "\n”,  and “1\n2,3” are valid examples.
  // DONE should throw an exception if there is any negative number,
  // DONE if there are many negative numbers, show them all in the exception message.
  // DONE Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2

  // After calculating the sum, String calculator should publish it to a remote API.
  // void RemoteApi.publish(sum);
  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @InjectMocks
  private StringCalculator calc;

  @Mock
  private Clock clock;

  @Mock
  private RemoteApi api;

  @Before
  public void setup() {
    when(clock.getCurrentTime()).thenReturn(LocalTime.of(9, 10));
  }

  @Test public void
  should_return_zero_when_input_is_empty() {
    int sum = calc.add("");
    assertEquals(0, sum);
  }

  @Test public void
  should_return_same_number_when_input_is_positive_number_below_1001() {
    int sum = calc.add("5");
    assertEquals(5, sum);
  }

  @Test public void
  should_return_zero_when_input_length_is_one_and_greater_than_1000() {
    int sum = calc.add("2000");
    assertEquals(0, sum);
  }

  @Test public void
  should_return_the_sum_of_numbers_seprated_by_comma() {
    int sum = calc.add("1,2,3");
    assertEquals(6, sum);
  }

  @Test public void
  should_return_the_sum_of_numbers_seprated_by_newline_chars_and_comma() {
    int sum = calc.add("1\n2,3");
    assertEquals(6, sum);
  }

  @Test(expected = IllegalArgumentException.class) public void
  should_throw_an_exception_when_there_is_a_negative_number_in_list() {
    calc.add("1\n2,-3");
  }

  @Test public void
  should_throw_an_exception_along_with_all_negative_numbers_when_there_are_multiple_negative_number_in_list() {
    expectedException.expect(IllegalArgumentException.class);
    expectedException.expectMessage("multiple negative numbers found. [-2, -3, -4]");
    calc.add("1,-2,-3,-4");
  }

  @Test public void
  should_ignore_number_greater_than_1000() {
    int sum = calc.add("1\n2,1001");
    assertEquals(3, sum);
  }

  @Test public void
  should_return_zero__when_not_between_9AM_and_6PM() {
    when(clock.getCurrentTime()).thenReturn(LocalTime.of(8, 0));

    int sum = calc.add("1,2,3");
    assertEquals(0, sum);
  }

  @Test public void
  should_publish_to_remote_api_when_the_sum_is_calculated() {

    int sum = calc.add("1,2,3");
    verify(api).publish(sum); // assertion
  }
}




