package com.simpleproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class N_AryTreePreorderTraversal {
	static List<Integer> result = new ArrayList<>();

	public static List<Integer> preorder(Node root) {
		if (root == null)
			return result;

		List<Integer> preorder = new ArrayList<>();
		Stack<Node> ele = new Stack<>();
		ele.push(root);
		while (!ele.empty()) {
			Node cur = ele.pop();
			preorder.add(cur.val);
			if (cur.children != null) {
				for (int i = cur.children.size() - 1; i >= 0 ; i--) {
					ele.push(cur.children.get(i));
				}
			}
		}
		return preorder;
	}

	public static void main(String[] args) {

		List<Node> childs = new ArrayList<>();
		List<Node> child2 = new ArrayList<>();

		Node root = new Node(1);

		child2.add(new Node(5));
		child2.add(new Node(6));

		childs.add(new Node(3, child2));
		childs.add(new Node(2));
		childs.add(new Node(4));
		root.children = childs;

		preorder(root);
	}
}

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};
