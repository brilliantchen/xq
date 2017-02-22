package com.xq.lite.collection.list;

import java.util.Iterator;

import com.xq.lite.collection.Node;

public class MyLinkList<T> implements Iterable<T> {
	
	private int size;
	private Node<T> head;
	private Node<T> tail;
	
	public MyLinkList() {
		super();
		this.head = null;
		this.tail = null;
	}
	
	/**
	 * 添加数据
	 * @param data
	 */
	public void add(T data){
		if(head == null){
			head = new Node<T>(data);
			tail = head;
			size++;
			return;
		}else{
			tail.setNext(new Node<T>(data));
			tail = tail.getNext();
			size++;
			return;
		}
	}
	
	public T get(int index){
		if(index > size-1){
			System.err.println("out of index");
			return null;
		}else{
			Node<T> rt = head;
			for (int i = 0; i < size-1; i++) {
				if(i == index){
					break;
				}else{
					rt = rt.getNext();
				}
			}
			return rt.getData();
		}
	}
	
	public Node<T> getNode(int index){
		if(index > size-1){
			System.err.println("out of index");
			return null;
		}else{
			Node<T> rt = head;
			int count = 0;
			while(count < index){
				rt = rt.getNext();
				count ++;
			}
			return rt;
		}
	}
	
	/**
	 * 删除数据
	 * @param index
	 * @return
	 */
	public boolean remove(int index){
		if(index > size-1){
			System.err.println("out of index");
			return false;
		}else{
			if(index == 0){
				head = head.getNext();
				size --;
				return true;
			}else{
				int count =0;
				Node<T> t = head;
				while(count < index-1){
					t = t.getNext();
					count ++;
				}
				t.setNext(t.getNext().getNext());
				size--;
				return true;
			}
		}
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		if(size <1) return "";
		Node<T> t=head;
		StringBuilder sb = new StringBuilder();
		sb.append("MyLinkList [size=" + size );
		sb.append(" head="+t.toString());
		while(t.getNext() != null){
			t = t.getNext();
			sb.append(","+t.toString());
		}
		sb.append("]");
		return sb.toString();
	}

	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
