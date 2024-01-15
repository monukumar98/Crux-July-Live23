package Lec55;

import java.util.HashMap;

public class Tries_Contacts {

	class Node {
		char data;
		boolean isTerminal;
		HashMap<Character, Node> child = new HashMap<>();
		int count = 1;
	}

	private Node root;

	public Tries_Contacts() {
		// TODO Auto-generated constructor stub
		Node nn = new Node();
		nn.data = '*';
		root = nn;
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;

			} else {
				Node n = new Node();
				n.data = ch;
				curr.child.put(ch, n);
				curr = n;
			}
		}
		curr.isTerminal = true;

	}

	public int find(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);

			} else {
				return 0;
			}
		}
		return curr.count;
	}

	public static void main(String[] args) {
		Tries_Contacts t = new Tries_Contacts();
		t.insert("hacker");
		t.insert("hackerrrr");
		System.out.println(t.find("hac"));

	}
}
