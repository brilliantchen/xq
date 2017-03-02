package com.xq.lite.collection.queue;

public interface IXqQueue<E> {

	public abstract boolean isEmpty();

	public abstract boolean offer(E e);

	public abstract E peek();

	public abstract E pull();

	public abstract int size();

	public abstract void clear();

}