package Lec34;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LibkedList ll = new LibkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddLast(40);
		ll.AddatIndex(-20, 2);
		ll.AddLast(42);
		ll.AddLast(67);
		ll.AddLast(90);
		ll.Display();
//		System.out.println(ll.getfirst());
//		System.out.println(ll.getlast());
//		System.out.println(ll.getindex(2));
		System.out.println(ll.removefirst());
		ll.Display();
		System.out.println(ll.removelast());
		ll.Display();
		System.out.println(ll.removeatindex(2));
		ll.Display();

	}
}
