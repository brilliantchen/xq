package com.xq.lite.collection.queue;

import java.util.Arrays;
/**
 * 基于数组的循环队列
 * @author xiaochen
 *
 * @param <E>
 */
public class MyArrayLoopQueue<E> implements IXqQueue<E> {
	private Object[] data;
	private int maxSize;
	private int size;
 	private int front;
 	private int rear;
	
 	public MyArrayLoopQueue(){
 		this(10);
 	}
 	
 	public MyArrayLoopQueue(int initSize){
 		if (initSize >= 0) {
 			this.maxSize = initSize;
 			data = new Object[maxSize];
 			this.size = 0;
 			this.front = 0;
 			this.rear = 0;
 		}
 	}
 	
 	/* (non-Javadoc)
	 * @see com.xq.lite.collection.queue.IXqQueue#isEmpty()
	 */
 	@Override
	public boolean isEmpty(){
 		return size == 0;
 	}
 	
 	/* (non-Javadoc)
	 * @see com.xq.lite.collection.queue.IXqQueue#offer(E)
	 */
 	@Override
	public boolean offer(E e){
 		if(size == maxSize){
 			return false;
 		}else{
 			data[rear] = e;
 			rear = (rear+1)%maxSize;
 			size++;
 		}
 		return true;
 	}
 	
 	/* (non-Javadoc)
	 * @see com.xq.lite.collection.queue.IXqQueue#peek()
	 */
 	@Override
	public E peek(){
 		if(isEmpty()){
 			return null;
 		}else{
 			return (E) data[front];
 		}
 	}
 	
 	/* (non-Javadoc)
	 * @see com.xq.lite.collection.queue.IXqQueue#pull()
	 */
 	@Override
	public E pull(){
 		if(isEmpty()){
 			return null;
 		}else{
 			E rtn = (E) data[front];
 			data[front] = null;
 			front = (front +1)%maxSize;
 			size--;
 			return rtn;
 		}
 	}
 	
 	/* (non-Javadoc)
	 * @see com.xq.lite.collection.queue.IXqQueue#size()
	 */
 	@Override
	public int size(){
 		return size;
 	}
 	
 	/* (non-Javadoc)
	 * @see com.xq.lite.collection.queue.IXqQueue#clear()
	 */
 	@Override
	public void clear(){
 		Arrays.fill(data, null);
 		this.size = 0;
		this.front = 0;
		this.rear = 0;
 	}
}
