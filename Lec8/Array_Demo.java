package Lec8;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int[] arr = new int[5];
		System.out.println(arr);
		int[] other = arr;
		arr[0] = 10;
		arr[1] = 2;
		arr[2] = 6;
		arr[3] = 7;
		arr[4] = 9;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(other.length);// Array ki length 

	}

}
