package Lec49;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algorithm(int v) {
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

	class DijkstraPair {
		int vtx;
		String path;
		int cost;

		public DijkstraPair(int vtx, String path, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.path = path;
			this.cost = cost;
		}

		public String toString() {
			return this.vtx + " - " + this.path + " @ " + this.cost;
		}
	}

	public void Dijkstra(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			DijkstraPair rp = pq.poll();

			// 2. Ignore if Already Visited
			if (visited.contains(rp.vtx)) {
				continue;
			}

			// 3. Marked visited
			visited.add(rp.vtx);

			// 4.Slef Work
			System.out.println(rp);

			// 5.Add unvisited nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.path + nbrs, rp.cost + cost));
				}

			}
		}

	}

	public static void main(String[] args) {
		Dijkstra_Algorithm dj = new Dijkstra_Algorithm(7);
		dj.AddEdge(1, 4, 6);
		dj.AddEdge(1, 2, 10);
		dj.AddEdge(2, 3, 7);
		dj.AddEdge(3, 4, 5);
		dj.AddEdge(4, 5, 1);
		dj.AddEdge(5, 6, 4);
		dj.AddEdge(7, 5, 2);
		dj.AddEdge(6, 7, 3);
		dj.Dijkstra(1);
	}

}
