package Lec41;

public class Construct_Binary_Tree_from_Preorder_and_Inorder {
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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return Cereate(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

		}

		public TreeNode Cereate(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}
			TreeNode node = new TreeNode(pre[plo]);
			int idx = Search(in, ilo, ihi, pre[plo]);// 5
			int ne = idx - ilo;
			node.left = Cereate(pre, plo + 1, plo + ne, in, ilo, idx - 1);
			node.right = Cereate(pre, plo + ne + 1, phi, in, idx + 1, ihi);

			return node;

		}

		public int Search(int[] in, int si, int ei, int item) {
			for (int i = si; i <= ei; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return 0;

		}
	}
}
