package com.xq.lite.collection.stack;

import com.xq.lite.collection.Node;

public class MyLinkStack<E> implements IXqStack<E> {
	
	private int size;
	private Node<E> top;
	
	public MyLinkStack(){
		super();
		this.size = 0;
		this.top = null;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public boolean push(E e) {
		Node<E> node = new Node<E>(e);
		if(top ==null){
			top= node;
		}else{
			Node<E> tmp = top;
			top = node;
			top.setNext(tmp);
		}
		size++;
		return true;
	}

	@Override
	public E peek() {
		if(isEmpty()){
			return null;
		}else{
			return top.getData();
		}
	}

	@Override
	public E pop() {
		if(isEmpty()){
			return null;
		}else{
			Node<E> node = top;
			E e = (E) node.getData();
			top = top.getNext();
			node = null;
			size --;
			return e;
		}
	}

	@Override
	public int search(E e) {
		int i = size;
		Node<E> node = top;
		while(node != null){
			if(node.getData() == e){
				break;
			}
			node = node.getNext();
			i--;
		}
		return --i;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<E> node = top;
		while(node != null){
			sb.append(node.toString());
			node = node.getNext();
			sb.append(",");
		}
		return "MyLinkStack [size=" + size + ", stack=" + sb.toString() + "]";
	}
	
}
