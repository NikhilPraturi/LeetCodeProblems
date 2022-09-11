package com.simpleproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> level = new ArrayList<>();

		if (root == null) {
			return level;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			List<Integer> ele = new ArrayList<>();
			int size = q.size();
			while (size-- > 0) {
				TreeNode n = q.poll();
				ele.add(n.val);
				if (n.left != null)
					q.offer(n.left);
				if (n.right != null)
					q.offer(n.right);
			}

			level.add(ele);
		}
		return level;

	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode child = new TreeNode(20);
		
		child.left = new TreeNode(15);
		child.right = new TreeNode(7);
		
		root.left = new TreeNode(9);
		root.right = child;
		levelOrder(root);
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
