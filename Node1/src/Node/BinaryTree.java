package Node;

import java.util.ArrayList;

public class BinaryTree {

	Node root;

	// Helper function to perform inorder traversal
	private void inorderTraversal(Node node, ArrayList<Integer> result) {
		if (node != null) {
			inorderTraversal(node.left, result);
			result.add(node.data);
			inorderTraversal(node.right, result);
		}
	}

	// Function to check if the tree is a binary search tree
	public boolean isBinarySearchTree(Node root) {
		ArrayList<Integer> inorderResult = new ArrayList<>();
		inorderTraversal(root, inorderResult);

		// Check if the resulting sequence is sorted
		for (int i = 1; i < inorderResult.size(); i++) {
			if (inorderResult.get(i) <= inorderResult.get(i - 1)) {
				return false;
			}
		}
		return true;
	}
}
