package com.test.tdd;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StringReverserDemoTest {

   private StringReverser reverser;

   @Before
   public void setup() {
     // Arrangement
     reverser = new StringReverser();
   }

  // TODO:
  // DONE reverseString("") should return ""
  // DONE reverseString("a") should return "a"
  // DONE handle null
  // DONE reverseString("hello") should return "olleh"
  // DONE reverseString("1234567890") should return "0987654321"

  @Test public void
  should_return_empty_string_when_input_is_empty() {
    String str = reverser.reverseString("");

    assertEquals("", str);
  }

  @Test public void
  should_return_the_same_character_when_length_of_string_is_one() {
    // AAA format
    String str = reverser.reverseString("a");         // Act
    assertEquals("a", str);                  // Assert
  }

  @Test(expected = IllegalArgumentException.class) public void
  should_thrown_IllegalArgumentException_exception_when_input_is_null() {
    String str = reverser.reverseString(null);         // Act
  }

  @Test public void
  should_reverse_the_string() {
    String str = reverser.reverseString("hello");         // Act
    assertEquals("olleh", str);
    str = reverser.reverseString("1234567890");         // Act
    assertEquals("0987654321", str);
  }

}
