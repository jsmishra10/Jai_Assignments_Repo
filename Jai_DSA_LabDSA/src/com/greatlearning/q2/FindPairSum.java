package com.greatlearning.q2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Node {

	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;

	}

}

public class FindPairSum {

	Node root;

	Node insert(Node node, int key) {

		if (node == null) {
			node = new Node(key);
			return node;
		}
		if (key < node.data) {
			node.left = insert(node.left, key);
		} else if (key > node.data) {
			node.right = insert(node.right, key);
		}
		return node;
	}

	private void findThePairingSum(Node root, int sum) {
		
		Set<Integer> set = new HashSet<>();

		if (!findPair(root, sum, set))
			System.out.print("Pair is not found" + "\n");

	}

	private boolean findPair(Node root, int sum, Set<Integer> set) {
		
		if (root == null)
			return false;
		if (findPair(root.left, sum, set))
			return true;
		int diff = sum - root.data;
		if (set.contains(diff)) {
			System.out.println("Pair is (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		} else {
			set.add(root.data);
		}

		return findPair(root.right, sum, set);
	}


	public static void main(String[] args) {

		FindPairSum fps = new FindPairSum();
		fps.root = fps.insert(fps.root, 40);
		fps.insert(fps.root, 20);
		fps.insert(fps.root, 60);
		fps.insert(fps.root, 10);
		fps.insert(fps.root, 30);
		fps.insert(fps.root, 50);
		fps.insert(fps.root, 70);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sum value:");

		int sum = scan.nextInt();
		fps.findThePairingSum(fps.root, sum);

	}

}
