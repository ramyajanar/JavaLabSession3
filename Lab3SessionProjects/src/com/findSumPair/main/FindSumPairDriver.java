package com.findSumPair.main;

import com.findSumPair.service.FindSumPairTreeService;
import com.findSumPair.service.Node;

public class FindSumPairDriver {

	public static void main(String[] args) {
		{
			Node root = null;

			FindSumPairTreeService findSumPair = new FindSumPairTreeService();
			root = findSumPair.insert(root, 40);
			root = findSumPair.insert(root, 20);
			root = findSumPair.insert(root, 60);
			root = findSumPair.insert(root, 10);
			root = findSumPair.insert(root, 30);
			root = findSumPair.insert(root, 50);
			root = findSumPair.insert(root, 70);

			int sum = 70;
			findSumPair.findThePair(root, sum);
		}

	}

}
