package com.test.tdd;

import org.junit.Before;
import org.junit.Test;

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
  // reverseString("a") should return "a"

  // reverseString("hello") should return "olleh"
  // reverseString("1234567890") should return "0987654321"
  // handle null

  @Test public void
  should_return_empty_string_when_input_is_empty() {
    String str = reverser.reverseString("");
    assertEquals("", str);
  }

  @Test public void
  should_return_the_same_character_when_length_of_string_is_one() {
    // AAA format
    String str = reverser.reverseString("a");         // Act

    assertEquals("a", str);                   //Assert
  }
}
