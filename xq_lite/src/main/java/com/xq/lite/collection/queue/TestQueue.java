package com.xq.lite.collection.queue;

public class TestQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IXqQueue<String> q1 = new MyArrayLoopQueue<String>();
		q1.offer("11");
		q1.offer("22");
		q1.offer("33");
		q1.offer("44");
		System.out.println(q1);
		System.out.println(q1.pull());
		System.out.println(q1);
		System.out.println(q1.pull());
		System.out.println(q1.pull());
		System.out.println(q1);*/
		
		IXqQueue<String> q2 = new MyLinkQueue<String>();
		q2.offer("11");
		q2.offer("22");
		q2.offer("33");
		q2.offer("44");
		System.out.println(q2);
		System.out.println(q2.pull());
		System.out.println(q2);
		System.out.println(q2.pull());
		System.out.println(q2);

		q2.clear();
		System.out.println(q2);
	}

}
