package Lec29;

public class Stack {
	protected int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	// O(1)
	public boolean Isempty() {
		return idx == -1;
	}

	// O(1)
	public void push(int item) throws Exception {
		if(isfull()) {
			throw new Exception("Bklol stack full hai ");
		}
		idx++;
		arr[idx] = item;
	}

	// O(1)
	public int size() {
		return idx + 1;
	}

	// O(1)
	public boolean isfull() {
		return idx == arr.length - 1;
	}

	// O(1)
	public int pop() throws Exception {
		if(Isempty()) {
			throw new Exception("Bklol stack Empty hai ");
		}
		int rv = arr[idx];
		idx--;
		return rv;
	}

	// O(1)
	public int peek() throws Exception {
		if(Isempty()) {
			throw new Exception("Bklol stack Empty hai ");
		}
		int rv = arr[idx];
		return rv;
	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
