package com.xq.lite.thread.produceConsumer;

import com.xq.lite.thread.ProdConsTester;

public class Producer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 5;
		while(count > 0) {
			synchronized (ProdConsTester.obj) {
				System. out.println(Thread.currentThread().getName()+ "Producer---");
                count --;
                ProdConsTester.obj.notify();
                try {
                	ProdConsTester.obj.wait();
                } catch (InterruptedException e) {
                	e.printStackTrace();
                }
			}
        }
	}

	

}
