package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
    public StringCalculator() {}

    public int add(String inputNumbers) {
        if (inputNumbers.isEmpty()) return 0;
        List<Integer> numbers = Arrays.stream(inputNumbers.split("[\\n|\\,]"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> negativeNumbers = numbers.stream().filter(n -> n < 0).collect(Collectors.toList());
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative values are not supported: " + negativeNumbers.toString());
        }

        return numbers.stream().filter(n -> n <= 1000).reduce(0, Integer::sum);
    }
}
