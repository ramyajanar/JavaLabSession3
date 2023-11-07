package com.findSumPair.service;

import java.util.ArrayList;

public class FindSumPairTreeService {
	public Node insert(Node root, int key) {
		if (root == null)
			return new Node(key);
		if (key < root.data)
			root.left = insert(root.left, key);
		else
			root.right = insert(root.right, key);
		return root;
	}

	public boolean findPair(Node root, int sum, ArrayList<Integer> list) {
		if (root == null)
			return false;

		if (findPair(root.left, sum, list))
			return true;

		if (list.contains(sum - root.data)) {
			System.out.println("Pair is found (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		} else
			list.add(root.data);

		return findPair(root.right, sum, list);
	}

	public void findThePair(Node root, int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (!findPair(root, sum, list))
			System.out.print("Pairs do not exit");
	}

}
