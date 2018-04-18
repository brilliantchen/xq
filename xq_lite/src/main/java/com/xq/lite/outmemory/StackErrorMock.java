package com.xq.lite.outmemory;

public class StackErrorMock {

  private static int index = 1;

  public void call() {
    index++;
    call();
  }

  public static void main(String[] args) {
    StackErrorMock mock = new StackErrorMock();
    try {
      mock.call();
    } catch (Throwable e) {
      //此处使用Throwable， StackOverflowError 和 OutOfMemoryError 都不属于 Exception
      System.out.println("Stack deep : " + index);
      e.printStackTrace();
    }
  }

}
