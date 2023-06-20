package com.test.tdd;

import org.junit.Before;
import org.junit.Test;
import com.test.StringReverser;
import static org.junit.Assert.*;

public class StringReverserTest {
    // TODO:
    // DONE - reverseString("") should return ""
    // DONE - reverseString("a") should return "a"
    // DONE - handle null
    // DONE - reverseString("hello") should return "olleh"
    // reverseString("1234567890") should return "0987654321"
    StringReverser stringReverser;
    @Before
    public void setup() {
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

    @Test(expected = IllegalArgumentException.class) public void
    should_throw_IllegalArgumentException_when_input_is_null() {
        stringReverser.reverseString(null);
    }

    @Test public void
    should_return_reversed_string_when_input_is_non_empty_string() {
        String reversed = stringReverser.reverseString("hello");
        assertEquals("olleh", reversed);
        String reversedSpecialChar = stringReverser.reverseString("!@#$%^&*()-=");
        assertEquals("=-)(*&^%$#@!", reversedSpecialChar);
    }
}