package com.xq.lite.collection.list.my;

import java.util.Arrays;

public class MyArrayList<E> {
	
	private static final int DEFAULT_CAPACITY = 10;
	
	private static final Object[] EMPTY_ELEMENTDATA = {};
	
	private int size;
	
	private transient Object[] elementData;

	public MyArrayList() {
		super();
		this.elementData = new Object[DEFAULT_CAPACITY];
	}
	
	
	public void add(E e){
		elementData[size++] = e;
	}
	
	public E get(int index){
		return (E) elementData[index];
	}
	
	public boolean remove(int index){
		if(index > size -1){
			return false;
		}else{
			int numMoved = size -1 - index;
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
			elementData[--size] = null;
			return true;
		}
	}


	@Override
	public String toString() {
		return "MyArrayList [size=" + size + ", elementData="
				+ Arrays.toString(elementData) + "]";
	}

	

	public int getSize() {
		return size;
	}
	
	

}
