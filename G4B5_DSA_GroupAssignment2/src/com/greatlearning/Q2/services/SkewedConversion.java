package com.greatlearning.Q2.services;

import com.greatlearning.Q2.pojo.Node;

public class SkewedConversion {

	public Node prevNode = null;
	public Node headNode = null;

	public void convertToSkewed(Node root) {

		if (root == null) {
			return;
		}

		convertToSkewed(root.left);
		Node rightNode = root.right;
		

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		convertToSkewed(rightNode);

	}

	public void displaySkewedTree(Node root) {

		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		displaySkewedTree(root.right);
	}

}
