package com.xq.lite.collection.stack;


public class TestStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IXqStack<Integer> s1 = new MyArrayStack<Integer>();
		s1.push(2);
		s1.push(12);
		s1.push(22);
		s1.push(32);
		System.out.println(s1);
		System.out.println(s1.search(22));
		s1.pop();
		s1.pop();
		System.out.println(s1);*/
		
		IXqStack <Integer> s2 = new MyLinkStack<Integer>();
		s2.push(2);
		s2.push(12);
		s2.push(22);
		s2.push(32);
		System.out.println(s2);
		System.out.println(s2.search(2));
		s2.pop();
		s2.pop();
		System.out.println(s2);
		
	}

}
