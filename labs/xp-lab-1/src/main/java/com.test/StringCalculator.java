package com.test;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
    private final Clock clock;
    private final RemoteApi remoteApi;
    public StringCalculator(Clock clock, RemoteApi remoteApi) {
        this.clock = clock;
        this.remoteApi = remoteApi;
    }

    public int add(String inputNumbers) {
        LocalTime now = clock.getCurrentTime();
        if (now.isBefore(LocalTime.of(9, 0)) || now.isAfter(LocalTime.of(18, 0))) {
            throw new DateTimeException("Only allowed to run between 9am - 6pm");
        }
        if (inputNumbers.isEmpty()) return 0;
        List<Integer> numbers = Arrays.stream(inputNumbers.split("[\\n|\\,]"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> negativeNumbers = numbers.stream().filter(n -> n < 0).collect(Collectors.toList());
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative values are not supported: " + negativeNumbers.toString());
        }

        int summation = numbers.stream().filter(n -> n <= 1000).reduce(0, Integer::sum);
        remoteApi.publish(summation);

        return summation;
    }
}
