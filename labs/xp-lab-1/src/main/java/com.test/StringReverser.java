package com.test;

import java.util.concurrent.atomic.AtomicInteger;

public class StringReverser {
    // TODO: Implement the logic to reverse the input string
    public StringReverser() {}

    public String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        return new StringBuilder(input).reverse().toString();
    }
}
