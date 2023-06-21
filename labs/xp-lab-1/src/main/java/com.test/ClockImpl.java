package com.test;

import java.time.LocalTime;

public class ClockImpl implements Clock {
    @Override
    public LocalTime getCurrentTime() {
        return LocalTime.now();
    }
}
