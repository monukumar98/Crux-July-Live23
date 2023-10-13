package Lec23;

import java.util.ArrayList;
import java.util.List;

public class Two_2d_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		List<Integer> ll1 = new ArrayList<>();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		List<Integer> ll2 = new ArrayList<>();
		ll2.add(101);
		ll2.add(201);
		ll2.add(301);
		List<List<Integer>> ans = new ArrayList<>();
		ans.add(ll);
		ans.add(ll1);
		ans.add(ll2);
		System.out.println(ans);

	}

}
