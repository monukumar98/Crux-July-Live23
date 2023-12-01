package Lec39;

public class LCA {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			if (root == null) {
				return null;
			}
			if (root == p || root == q) {
				return root;
			}
			TreeNode left = lowestCommonAncestor(root.left, p, q);
			TreeNode right = lowestCommonAncestor(root.right, p, q);
			if (right != null && left != null) {
				return root;
			} else if (left == null) {
				return right;
			} else {
				return left;
			}
		}
	}

}
