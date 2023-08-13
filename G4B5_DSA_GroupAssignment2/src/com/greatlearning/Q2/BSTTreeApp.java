package com.greatlearning.Q2;

/*
 * You are working in an MNC, which manages the Transactions, where only BST is used as a Data Structure. 
 * The company stores all the data of transactions in BST such that the tree is always a complete BST. 
 * A new business requirement has arrived where the BST should not contain any left node.
 * You are required to modify the existing BST and display the node values present in ascending order.
 * 
 */
import java.io.*;

class Node {

	int val;
	Node left, right;

	Node(int item) {
		val = item;
		left = right = null;
	}

}

public class BSTTreeApp {

	static Node node;

	public static void main(String[] args) {

		BSTTreeApp tree = new BSTTreeApp();

		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		SkewedBSTTree skBstTree = new SkewedBSTTree();
		skBstTree.convertToSkewed(node);
		skBstTree.displaySkewedTree(skBstTree.headNode);

	}
}