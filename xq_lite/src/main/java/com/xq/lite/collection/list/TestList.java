package com.xq.lite.collection.list;

public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyLinkList<String> ls = new MyLinkList<String>();
		ls.add("11");
		ls.add("22");
		ls.add("33");
		ls.add("44");
		ls.add("55");
		
		System.out.println(ls.toString());
		ls.remove(2);
		System.out.println(ls.toString());
		for (int i = 0; i < ls.getSize(); i++) {
			System.out.println(i+" "+ls.getNode(i));
		}
	}

}
