package com.xq.lite.thread.threadlocal;

public class TLocalRun {

  public static ThreadLocal<String> thLocal = new ThreadLocal<String>();

  public static void main(String[] args) {
    TLocalTest test1 = new TLocalTest(10);
    TLocalTest test2 = new TLocalTest(20);
    test1.start();
    test2.start();
    thLocal.set("main");

    System.out.println(thLocal.get());
  }

}
