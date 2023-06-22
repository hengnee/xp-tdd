package com.test.tdd.numbergame;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class ListTest {

  @Test public void
  should_test_list() {

    // static functions should not be mocked
    List mockedList = mock(List.class);

    when(mockedList.get(1)).thenReturn("one"); // stub

    mockedList.add("one");
    mockedList.clear();
    Object o = mockedList.get(1);
    System.out.println(o);

    //test interaction
    verify(mockedList).add("one");    // mock
    verify(mockedList).clear();
  }
}
