package Lec39;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Using_Level_Order {

	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node root;

	public Create_Tree_Using_Level_Order() {
		// TODO Auto-generated constructor stub
		createTree();
	}

	private void createTree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		Node node = new Node(e);
		root = node;
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		while (!q.isEmpty()) {
			Node rv = q.poll();// remove first
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node nn = new Node(c1);
				rv.left = nn;
				q.add(nn);

			}
			if (c2 != -1) {
				Node nn = new Node(c2);
				rv.right = nn;
				q.add(nn);
			}

		}
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "<--" + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);

	}

	public static void main(String[] args) {
		Create_Tree_Using_Level_Order cl = new Create_Tree_Using_Level_Order();
		cl.Display();
// 10 20 30 40 50 -1 70 -1 -1 60 -1 -1 -1 -1 -1		
	}

}
