package com.test.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverserDemoTest {

  // TODO:
  // reverseString("") should return ""

  // reverseString("hello") should return "olleh"
  // reverseString("a") should return "a"
  // reverseString("1234567890") should return "0987654321"
  // handle null

  @Test public void
  should_return_empty_string_when_input_is_empty() {
    StringReverser reverser = new StringReverser();
    String str = reverser.reverseString("");
    assertEquals("", str);
  }
}
