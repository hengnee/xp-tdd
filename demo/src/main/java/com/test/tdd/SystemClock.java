package com.test.tdd;

import java.time.LocalTime;

public class SystemClock implements Clock{
  @Override
  public LocalTime getCurrentTime() {
    return LocalTime.now();
  }
}
