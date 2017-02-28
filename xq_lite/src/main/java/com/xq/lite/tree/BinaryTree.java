package com.xq.lite.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
	
	private TreeNode<T> root;
	
	public void insert(int key, T value){
		TreeNode<T> newNode = new TreeNode<T>(key, value);
		if(root == null){
			root = newNode;
			return;
		}else{
			TreeNode<T> currentNode = root;
			while(true){
				if(key > currentNode.getKey()){
					if(currentNode.getRightChild() == null){
						currentNode.setRightChild(newNode);
						return;
					}else{
						currentNode = currentNode.getRightChild();
					}
				}else{
					if(currentNode.getLeftChild() == null){
						currentNode.setLeftChild(newNode);
						return;
					}else{
						currentNode = currentNode.getLeftChild();
					}
				}
			}
		}
	}
	
	public TreeNode<T> find(int key){
		if(root != null){
			TreeNode<T> currentNode = root;
			while(currentNode.getKey() != key){
				if(key > currentNode.getKey()){
					currentNode = currentNode.getRightChild();
				}else{
					currentNode = currentNode.getLeftChild();
				}
				if(currentNode == null){
					return null;
				}
			}
			return currentNode;
		}
		return null;
	}
	
	public void preViewTree(TreeNode<T> node){
		if(node != null){
			System.out.println(node.toString());
			this.preViewTree(node.getLeftChild());
			this.preViewTree(node.getRightChild());
		}
	}
	
	public void orderViewTree(TreeNode<T> node){
		if(node != null){
			this.preViewTree(node.getLeftChild());
			System.out.println(node.toString());
			this.preViewTree(node.getRightChild());
		}
	}
	
	public void postViewTree(TreeNode<T> node){
		if(node != null){
			this.preViewTree(node.getLeftChild());
			this.preViewTree(node.getRightChild());
			System.out.println(node.toString());
		}
	}
	

	public BinaryTree(TreeNode<T> node) {
		super();
		this.root = node;
	}

	public TreeNode<T> getNode() {
		return root;
	}

	public void setNode(TreeNode<T> node) {
		this.root = node;
	}
	
	public void printTree(TreeNode<T> root){
        if(root == null)
            return;
        Queue<TreeNode<T>> queue = new LinkedList<TreeNode<T>>();
        
        int current;//当前层 还未打印的结点个数
        int next;//下一层结点个数
        
        queue.offer(root);
        current = 1;
        next = 0;
        while(!queue.isEmpty()){
            TreeNode<T> currentNode = queue.poll();
            System.out.printf("%-4d", currentNode.getKey());
            current--;
            
            if(currentNode.getLeftChild() != null){
                queue.offer(currentNode.getLeftChild());
                next++;
            }
            if(currentNode.getRightChild() != null){
                queue.offer(currentNode.getRightChild());
                next++;
            }
            if(current ==0){
                System.out.println("----");
                current = next;
                next = 0;
            }
        }
    }
	
}
