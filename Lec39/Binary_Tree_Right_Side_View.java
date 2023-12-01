package Lec39;

import java.util.*;

public class Binary_Tree_Right_Side_View {
	public class TreeNode {
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

	class Solution {
		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			rightSide(root, 1, ll);
			return ll;

		}

		int maxd = 0;

		public void rightSide(TreeNode root, int cl, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (maxd < cl) {
				ll.add(root.val);// condition
				maxd = cl;
			}

			rightSide(root.right, cl + 1, ll);
			rightSide(root.left, cl + 1, ll);

		}

	}

}
