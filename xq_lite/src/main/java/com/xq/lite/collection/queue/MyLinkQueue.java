package com.xq.lite.collection.queue;

import com.xq.lite.collection.Node;
/**
 * 基于链表的队列
 * @author xiaochen
 *
 * @param <E>
 */
public class MyLinkQueue<E> implements IXqQueue<E>{
	private int size;
	private Node<E> front;
	private Node<E> rear;
	
	public MyLinkQueue(){
		this.size = 0;
		this.front = null;
		this.rear = null;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean offer(E e) {
		Node<E> node = new Node<E>(e);
		if(isEmpty()){
			this.rear = node;
			this.front = node;
			
		}else{
			rear.setNext(node);
			rear = rear.getNext();
		}
		size ++;
		return true;
	}

	@Override
	public E peek() {
		if(isEmpty()){
			return null;
		}else{
			return front.getData();
		}
	}

	@Override
	public E pull() {
		if(isEmpty()){
			return null;
		}else{
			Node<E> rtn = front;
			E value = rtn.getData();
			front = front.getNext();
			rtn = null;
			size--;
			return value;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		while(front != null){
			Node<E> node = front;
			System.out.println(size+" front="+node.toString());
			front = front.getNext();
			node = null;
			size--;
		}
		
	}
	
	
	
	
}
