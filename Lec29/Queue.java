package Lec29;

public class Queue {
	protected int[] arr;
	protected int front = 0;
	private int size = 0;

	public Queue() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Queue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public boolean Isempty() {
		return size == 0;
	}

	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("bklol Queue full hai");
		}
		int idx = (front + size) % arr.length;
		arr[idx] = item;
		size++;

	}

	public int Dequeue() throws Exception {
		if (Isempty()) {
			throw new Exception("bklol Queue empty hai");
		}
		int rv = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return rv;

	}

	public int getfront() throws Exception {
		if (Isempty()) {
			throw new Exception("bklol Queue empty hai");
		}

		int rv = arr[front];
		return rv;
	}

	public boolean isfull() {
		return size == arr.length;
	}

	public int size() {
		return size;
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");

		}
		System.out.println();
	}

}
