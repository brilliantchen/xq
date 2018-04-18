package com.xq.lite.refer;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 强引用、软引用（SoftReference）、弱引用(WeakReference)、虚引用(PhantomReference)
 */
public class ReferenceTest {

  public static void main(String[] args) throws Exception {
    //ReferenceTest.soft();
    ReferenceTest.weak();

  }

  /**
   * 如果内存空间足够，GC就不会去回收这个对象
   */
  public static void soft() throws Exception{
    Object obj = new Object();
    ReferenceQueue rq = new ReferenceQueue<>();
    SoftReference sr  = new SoftReference(obj, rq);
    System.out.println(sr.get());
    System.out.println(rq.poll()); //输出为null
    obj = null;
    System.gc();
    Thread.sleep(200);//因为finalizer线程优先级很低，所以让线程等待200ms
    System.out.println(sr.get());  //因为堆空间没满，所以还是会输出这个obj对象的hashcode
    System.out.println(rq.poll());

  }


  /**
   * GC会被回收
   */
  public static void weak() throws Exception{
    Object obj = new Object();
    ReferenceQueue rq = new ReferenceQueue<>();
    WeakReference wr = new WeakReference(obj,rq);
    System.out.println(wr.get());
    System.out.println(rq.poll());
    obj = null;
    System.gc();
    Thread.sleep(200);
    System.out.println(wr.get());//这时候会输出null
    System.out.println(rq.poll());//rq队列里也会存放这个弱引用，输出它的hashcode
  }


}
