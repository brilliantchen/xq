package com.xq.lite.thread.produceConsumer;

import com.xq.lite.thread.produceConsumer.Consumer;
import com.xq.lite.thread.produceConsumer.Producer;

public class ProdConsTester {

  public static final Object obj = new Object();

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    new Thread(new Producer()).start();
    new Thread(new Consumer()).start();

  }

}
