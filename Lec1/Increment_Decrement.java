package Lec1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
//		System.out.println(a++);// post Increment
//		System.out.println(a);
//		int b=11;
//		System.out.println(b--);// post Decrement
//		System.out.println(b);

//		int x = a++ + 6 + a-- - a-- + a++ - a++;//12
//		int x = a-- + 7 + a-- + 8 + a++;
//		System.out.println(x);
//		int b = 10;
//		System.out.println(++b);//Per Increment
//		System.out.println(b);
//
//		int c = 19;
//		System.out.println(--c);//  Pre Decrement
//		System.out.println(c);
		int x = a++ + --a - ++a + 11 + a++ - a-- + ++a;
		System.out.println(x);

	}
}
