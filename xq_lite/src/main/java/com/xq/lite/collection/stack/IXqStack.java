package com.xq.lite.collection.stack;

public interface IXqStack<E> {

	public abstract boolean isEmpty();

	public abstract boolean push(E e);

	public abstract E peek();

	public abstract E pop();

	public abstract int search(E e);

	public abstract String toString();

}