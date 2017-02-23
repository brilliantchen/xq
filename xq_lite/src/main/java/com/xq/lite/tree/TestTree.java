package com.xq.lite.tree;

public class TestTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode<String> node = new TreeNode<String>(1, "1");
		BinaryTree<String> tree = new BinaryTree<String>(node);
		tree.insert(2, "2");
		tree.insert(7, "7");
		tree.insert(3, "3");
		tree.insert(22, "22");
		tree.insert(10, "10");
		tree.insert(4, "4");
		tree.printTree(tree.getNode());
		/*System.out.println("先序------------------");
		tree.preViewTree(tree.getNode());
		System.out.println("中序------------------");
		tree.orderViewTree(tree.getNode());
		System.out.println("后序------------------");
		tree.postViewTree(tree.getNode());*/
	}

}
