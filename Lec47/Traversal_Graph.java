package Lec47;

import java.util.*;

public class Traversal_Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Traversal_Graph(int v) {
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

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int key : map.keySet()) {
			if (visited.contains(key)) {
				continue;
			}
			q.add(key);
			while (!q.isEmpty()) {
				// 1. remove
				int rv = q.poll();

				// 2. Ignore if Already Visited
				if (visited.contains(rv)) {
					continue;
				}

				// 3. add visited
				visited.add(rv);

				// 4.self Work
				System.out.print(rv + " ");

				// 5. Add unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}

		}
		System.out.println();
	}

	public void DFT() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int key : map.keySet()) {
			if (visited.contains(key)) {
				continue;
			}
			s.push(key);
			while (!s.isEmpty()) {
				// 1. remove
				int rv = s.pop();

				// 2. Ignore if Already Visited
				if (visited.contains(rv)) {
					continue;
				}

				// 3. add visited
				visited.add(rv);

				// 4.self Work
				System.out.print(rv + " ");

				// 5. Add unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}

		}
		System.out.println();
	}

	public static void main(String[] args) {
		Traversal_Graph tg = new Traversal_Graph(7);
		tg.AddEdge(1, 4, 6);
		tg.AddEdge(1, 2, 10);
		tg.AddEdge(2, 3, 7);
		tg.AddEdge(3, 4, 5);
		tg.AddEdge(4, 5, 1);
		tg.AddEdge(5, 6, 4);
		tg.AddEdge(7, 5, 2);
		tg.AddEdge(6, 7, 3);
		tg.BFT();
		tg.DFT();
	}
}
