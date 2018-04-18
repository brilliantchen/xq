package com.xq.lite.thread.threadlocal;

public class TLocalTest extends Thread {

  public static ThreadLocal<Integer> thLocal = new ThreadLocal<Integer>();

  public Integer num;

  public TLocalTest(Integer num) {
    super("线程" + num);
    this.num = num;
  }

  @Override
  public void run() {
    Integer n = thLocal.get();
    if(n == null) {
      thLocal.set(num);
    }
    System.out.println(thLocal.get());
  }

}
