package Lec45;

import java.util.*;

public class HashMap<K, V> {
	class Node {
		K Key;
		V value;
		Node next;
	}

	private ArrayList<Node> bukt;
	private int size = 0;

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}
	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public void put(K key, V value) {
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.Key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node();
		nn.Key = key;
		nn.value = value;
		temp = bukt.get(idx);
		nn.next = temp;
		bukt.set(idx, nn);// upated krega
		size++;
		double lf = (1.0 * size) / bukt.size();
		double thf = 2.0;
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> a = new ArrayList<>();
		for (int i = 0; i < 2 * bukt.size(); i++) {
			a.add(null);
		}
		ArrayList<Node> old_bukt = bukt;
		bukt = a;
		size = 0;
		for (Node temp : old_bukt) {
			while (temp != null) {
				put(temp.Key, temp.value);
				temp = temp.next;
			}
		}

	}

	public boolean containsKey(K key) {
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.Key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);

		while (temp != null) {
			if (temp.Key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int idx = Hashfun(key);
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.Key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			bukt.set(idx, curr.next);
			curr.next = null;
			size--;
			return curr.value;

		} else {
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.value;
		}

	}

	public int Hashfun(K key) {
		int n = key.hashCode() % bukt.size();
		if (n < 0) {
			n += bukt.size();
		}
		return n;

	}

	public String toString() {
		String s = "{";
		for (Node temp : bukt) {
			while (temp != null) {
				s = s + temp.Key + "=" + temp.value + ", ";
				temp = temp.next;
			}
		}
		s= s.trim();
		return s + "}";

	}

}
