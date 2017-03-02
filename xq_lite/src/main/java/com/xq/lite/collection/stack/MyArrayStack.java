package com.xq.lite.collection.stack;

import java.util.Arrays;

public class MyArrayStack<E> implements IXqStack<E> {
	
	private Object[] data;
	private int maxSize;
	private int top;
	
	public MyArrayStack(){
		this(10);
	}
	
	public MyArrayStack(int initSize){
		if(initSize > 0){
			data = new Object[initSize];
			top = -1;
			maxSize = initSize;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.xq.lite.collection.stack.IXqStack#isEmpty()
	 */
	@Override
	public boolean isEmpty(){
		return top ==-1 ? true:false;
	}
	
	/* (non-Javadoc)
	 * @see com.xq.lite.collection.stack.IXqStack#push(E)
	 */
	@Override
	public boolean push(E e){
		if(top == maxSize -1){
			return false;
		}else{
			data[++top] = e;
			return true;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.xq.lite.collection.stack.IXqStack#peek()
	 */
	@Override
	public E peek(){
		if(isEmpty()){
			return null;
		}else{
			return (E) data[top];
		}
	}
	
	/* (non-Javadoc)
	 * @see com.xq.lite.collection.stack.IXqStack#pop()
	 */
	@Override
	public E pop(){
		if(isEmpty()){
			return null;
		}else{
			return (E) data[top--];
		}
	}
	
	/* (non-Javadoc)
	 * @see com.xq.lite.collection.stack.IXqStack#search(E)
	 */
	@Override
	public int search(E e){
		int i = top;
		while(i != -1){
			if(data[i] == e){
				break;
			}
			i--;
		}
		return i;
	}

	/* (non-Javadoc)
	 * @see com.xq.lite.collection.stack.IXqStack#toString()
	 */
	@Override
	public String toString() {
		return "MyArrayStack [data=" + Arrays.toString(data) + ", maxSize="
				+ maxSize + ", top=" + top + "]";
	}
	
}
