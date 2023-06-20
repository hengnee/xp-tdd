package com.test.tdd;

import org.junit.Before;
import org.junit.Test;
import com.test.StringReverser;
import static org.junit.Assert.*;

public class StringReverserTest {
    // TODO:
    // DONE - reverseString("") should return ""
    // reverseString("a") should return "a"
    // handle null
    // reverseString("hello") should return "olleh"
    // reverseString("1234567890") should return "0987654321"
    StringReverser stringReverser;
    @Before
    void setup() {
        stringReverser = new StringReverser();
    }

    @Test public void
    should_return_empty_string_when_input_is_empty() {
        String reversed = stringReverser.reverseString("");
        assertEquals("", reversed);
    }

    @Test public void
    should_return_same_character_when_input_is_single_character() {
        String reversed = stringReverser.reverseString("a");
        assertEquals("a", reversed);
    }

    @Test public void
    should_return_null_when_input_is_null() {
        String reversed = stringReverser.reverseString(null);
        assertEquals(null, reversed);
    }
}