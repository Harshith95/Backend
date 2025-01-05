package LeetCodeTrees;

import java.util.ArrayList;
import java.util.List;

import LeetCode.TreeNode;

public class InOrderBinTree {
	public static void main(String[] args) {

	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> resList = new ArrayList<>();
		return resList;
	}

	/**
	 * Left -> root -> rights
	 */
	public static void inOrder(TreeNode root, List<Integer> resList) {
		inOrder(root.left, resList);
		resList.add(root.val);
		inOrder(root.right, resList);
	}

}
