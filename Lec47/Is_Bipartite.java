package Lec47;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Bipartite {
	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int key = 0; key < graph.length; key++) {
				if (visited.containsKey(key)) {
					continue;
				}
				q.add(new BipartitePair(key, 0));
				while (!q.isEmpty()) {
					// 1. Remove
					BipartitePair rp = q.poll();
					// 2. Ignore if Already Visited
					if (visited.containsKey(rp.vtx)) {
						if (visited.get(rp.vtx) != rp.dis) {
							return false;
						}
						continue;

					}
					// 3. Marked visisted
					visited.put(rp.vtx, rp.dis);
					// 4. Self Work (Nothing here)
					// 5. Add unvisited nbrs
					for (int nbrs : graph[rp.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rp.dis + 1));
						}
					}

				}
			}
			return true;

		}

		class BipartitePair {
			int vtx;
			int dis;

			public BipartitePair(int vtx, int dis) {
				// TODO Auto-generated constructor stub
				this.vtx = vtx;
				this.dis = dis;
			}
		}
	}

}
