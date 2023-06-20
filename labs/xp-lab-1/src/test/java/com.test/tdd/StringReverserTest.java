package com.test.tdd;

import org.junit.Test;
import com.test.StringReverser;
import static org.junit.Assert.*;

public class StringReverserTest {
    // TODO:
    // reverseString("") should return ""
    // reverseString("a") should return "a"
    // handle null
    // reverseString("hello") should return "olleh"
    // reverseString("1234567890") should return "0987654321"

    @Test public void
    should_return_empty_string_when_input_is_empty() {
        StringReverser stringReverser = new StringReverser();
        String reversed = stringReverser.reverseString("");
        assertEquals("", reversed);
    }
}