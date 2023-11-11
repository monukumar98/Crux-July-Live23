package Lec33;

import Lec29.Stack;

public class Dynamic_Stack extends Stack {
	@Override
	public void push(int item) throws Exception {

		if (isfull()) {
			int[] ar = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				ar[i] = arr[i];
			}
			arr = ar;
		}
		super.push(item);

	}

	public static void main(String[] args) throws Exception {
		Dynamic_Stack ds = new Dynamic_Stack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.Display();
	}

}
