package Node;

import java.util.ArrayList;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}

	private void inorderTraversal(Node root, ArrayList<Integer> inorderResult) {
		// TODO Auto-generated method stub

	}

	// Example usage
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		// Construct a binary tree
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(7);

		// Check if the tree is a binary search tree
		System.out.println(tree.isBinarySearchTree(tree.root)); // Output: true
	}
}
