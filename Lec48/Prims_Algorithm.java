package Lec48;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prims_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	class PrimsPair {
		int v;
		int acqv;
		int cost;

		public PrimsPair(int v, int acqv, int cost) {
			// TODO Auto-generated constructor stub
			this.v = v;
			this.acqv = acqv;
			this.cost = cost;
		}

		public String toString() {
			return v + "-" + acqv + " @ " + cost;
		}
	}

	public int prims() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		int sum = 0;
		while (!pq.isEmpty()) {
			// 1. remove
			PrimsPair rp = pq.poll();
			// 2. Ignore if Alrady visited
			if (visited.contains(rp.v)) {
				continue;
			}
			// 3. Marked visited
			visited.add(rp.v);
			// 4. Self Work
			System.out.println(rp);
			sum += rp.cost;
			// 5. Add unvisited
			for (int nbrs : map.get(rp.v).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.v).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.v, cost));
				}
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Prims_Algorithm ks = new Prims_Algorithm(n);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			ks.AddEdge(v1, v2, cost);
		}
		System.out.println(ks.prims());

	}

}
