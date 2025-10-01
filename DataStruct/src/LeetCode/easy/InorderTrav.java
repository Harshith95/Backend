package LeetCode.easy;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTrav {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));

		while (root != null) {
			System.out.println(root.left.val);
			System.out.println(root.right.val);
			System.out.println(root.val);
			break;
		}
		List<Integer> output = new ArrayList<>();
		recursiveApproach(root, output);
		// stackApproach(root);
		System.out.println(output);

	}

	private static void recursiveApproach(TreeNode root, List<Integer> output) {
		if (root != null) {
			recursiveApproach(root.left, output);
			output.add(root.val);
			recursiveApproach(root.right, output);
		}

	}

	private static void stackApproach(TreeNode root) {
		TreeNode curr = root;
		Stack<TreeNode> stc = new Stack<>();
		List<Integer> output = new ArrayList<>();
		while (curr != null || !stc.isEmpty()) { // stc.isEmpty() for root printing
			while (curr != null) {
				stc.push(curr);
				curr = curr.left;
			}
			curr = stc.pop();
			output.add(curr.val);
			curr = curr.right;
		}

		System.out.println(output);
	}
}
