package com.xq.lite.thread.produceConsumer;

import com.xq.lite.thread.ProdConsTester;

public class Consumer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 int count = 5;
         while(count > 0) {
              synchronized (ProdConsTester.obj) {
                  System. out.println(Thread.currentThread().getName()+ "---Consumer");
                  count --;
                  ProdConsTester.obj.notify(); // 主动释放对象锁
                   try {
                        ProdConsTester.obj.wait();
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
             }
        }
	}

}
