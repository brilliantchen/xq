package com.xq.lite.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

  private static final ReentrantLock lock = new ReentrantLock();
  private static final ReentrantLock fairlock = new ReentrantLock(true);
  private int n;


  public static void main(String[] args) {
    ReentrantLockTest rlt = new ReentrantLockTest();
    for (int i = 0; i < 100; i++) {
      Thread nonT = new Thread(new NonFairTestThread(rlt));
      nonT.setName("nonFair[" + (i + 1) + "]");
      nonT.start();

      Thread fairT = new Thread(new FairTestThread(rlt));
      fairT.setName("fair[" + (i + 1) + "]");
      fairT.start();
    }
  }

  // 非公平锁
  static class NonFairTestThread implements Runnable {
    private ReentrantLockTest rlt;

    public NonFairTestThread(ReentrantLockTest rlt) {
      this.rlt = rlt;
    }

    public void run() {
      lock.lock();
      try {
        rlt.setNum(rlt.getNum() + 1);
        System.out.println(Thread.currentThread().getName()
            + " nonfairlock***************" + rlt.getNum());
      } finally {
        lock.unlock();
      }
    }
  }

  // 公平锁
  static class FairTestThread implements Runnable {
    private ReentrantLockTest rlt;

    public FairTestThread(ReentrantLockTest rlt) {
      this.rlt = rlt;

    }

    public void run() {
      fairlock.lock();
      try {
        rlt.setNum(rlt.getNum() + 1);
        System.out.println(Thread.currentThread().getName()
            + "   fairlock=======" + rlt.getNum() + "   "
            + fairlock.getHoldCount() + " queuelength="
            + fairlock.getQueueLength());
      } finally {
        fairlock.unlock();
      }

    }
  }

  public void setNum(int n) {
    this.n = n;
  }

  public int getNum() {
    return n;
  }


}
