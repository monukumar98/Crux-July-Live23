package Lec48;

import java.util.HashMap;

public class DisJointSet {
	class Node {
		int rank;
		Node parent;
		int data;
	}

	private HashMap<Integer, Node> map = new HashMap<>();

	public void CreateSet(int v) {
		Node nn = new Node();
		nn.data = v;
		nn.rank = 0;
		nn.parent = nn;
		map.put(v, nn);

	}

	public int find(int v) {
		Node nn = map.get(v);
		return find(nn).data;

	}

	private Node find(Node nn) {
		if (nn.parent == nn) {
			return nn;
		}
		Node n = find(nn.parent);
		nn.parent = n;// path Compression
		return n;

	}

	public void union(int v1, int v2) {
		Node nn1 = map.get(v1);
		Node nn2 = map.get(v2);
		Node rn1 = find(nn1);
		Node rn2 = find(nn2);
		if (rn1.rank == rn2.rank) {
			rn1.parent = rn2;// rn1 ka parent rn2
			rn2.rank++;// rn2.rank = rn2.rank+1;
		} else if (rn1.rank > rn2.rank) {
			rn2.parent = rn1;
		} else {
			rn1.parent = rn2;
		}

	}
}
