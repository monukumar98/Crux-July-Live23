package Lec36;

public class Cycle_Removal_Algo {

	class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;

		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}

	// O(1)
	public void AddLast(int item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	// O(N)
	public void Display() {
		Node temp = head;
		while (temp != null) {

			System.out.print(temp.data + "-->");
			temp = temp.next;

		}
		System.out.println(".");

	}

	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol index range me dedo");

		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;

		}
		return temp;

	}

	public void CreateCycle() throws Exception {
		Node nn = GetNode(2);
		tail.next = nn;
	}

//O(N^2)
	public void CycleRemove1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}

	}

	public void CycleRemove2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
// Cycle ki length
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		// ek ko m distance chala do pehle
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;

		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public void floyedcycleremoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		Cycle_Removal_Algo cy = new Cycle_Removal_Algo();
		cy.AddLast(1);
		cy.AddLast(2);
		cy.AddLast(3);
		cy.AddLast(4);
		cy.AddLast(5);
		cy.AddLast(6);
		cy.AddLast(7);
		cy.AddLast(8);
		cy.CreateCycle();
		cy.CycleRemove2();
		cy.Display();

	}

}
