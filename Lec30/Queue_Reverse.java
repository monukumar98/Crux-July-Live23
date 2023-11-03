package Lec30;

import Lec29.Queue;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Display();
		Reverse(q);
		q.Display();

	}

	private static void Reverse(Queue q) throws Exception {
		// TODO Auto-generated method stub
		if (q.Isempty()) {
			return;
		}
		int x = q.Dequeue();
		Reverse(q);
		q.Enqueue(x);

	}

}
