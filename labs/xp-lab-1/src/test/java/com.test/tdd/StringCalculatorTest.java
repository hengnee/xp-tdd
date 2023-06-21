package com.test.tdd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.test.StringCalculator;

import java.time.Clock;
import java.time.LocalDateTime;

public class StringCalculatorTest {
    // 1. DONE - should return 0 when input numbers is empty
    // 5. DONE - should throw IllegalArgumentException when there is any negative number
    // 6. should show all negative numbers in IllegalArgumentException when there are multiple negative values
    // EXCLUDE - should return 0 when input only contains comma
    // EXCLUDE - should return 0 when input only contains new line character
    // 2. DONE - should return same number when input only contains 1 number
    // 3. DONE - should return 0 when input number is bigger than 1000
    // 4. DONE - should return sum of numbers between 0 and 1000 when input numbers are positive
    StringCalculator stringCalculator;
    @Before
    public void setup() {
        stringCalculator = new StringCalculator(null);
    }

    @Test public void
    should_return_zero_when_input_number_is_empty() {
        int result = stringCalculator.add("");
        assertEquals(0, result);
    }

    @Test public void
    should_return_same_number_when_input_only_contains_one_positive_number_not_above_1000() {
        int result = stringCalculator.add("1");
        assertEquals(1, result);
    }

    @Test public void
    should_return_0_when_input_value_above_1000() {
        int result = stringCalculator.add("1001");
        assertEquals(0, result);
    }

    @Test public void
    should_return_sum_of_numbers_between_0_and_1000_when_input_numbers_are_positive() {
        int result = stringCalculator.add("1,2,3,4,1000,1002,2002,3333");
        assertEquals(1010, result);
    }

    @Test(expected = IllegalArgumentException.class) public void
    should_throw_illegalArgumentException_when_input_has_negative_number() {
        stringCalculator.add("1,-2,3,4");
    }

    @Test public void
    should_show_all_negative_numbers_in_IllegalArgumentException_when_there_are_multiple_negative_values() {
        try {
            stringCalculator.add("1,-2,3\n-4");
        } catch(IllegalArgumentException ex) {
            assertEquals("Negative values are not supported: [-2, -4]", ex.getMessage());
        }
    }

    @Test(expected = RuntimeException.class) public void
    should_throw_runtimeexception_when_out_of_time_between_9am_and_6pm() {
        stringCalculator.add("1");
    }
}
