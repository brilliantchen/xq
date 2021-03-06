package com.xq.lite.tree;

public class TreeNode<T> {
	
	private int key;
	private T value;
	
	private TreeNode<T> leftChild;
	private TreeNode<T> rightChild;
	
	public TreeNode(int key, T value) {
		super();
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public TreeNode<T> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode<T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}
	
	@Override
	public String toString() {
		return "TreeNode [key=" + key + ", value=" + value + "]";
	}
	

}
