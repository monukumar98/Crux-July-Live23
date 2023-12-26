package Lec47;

import java.util.*;

public class Vaild_Tree {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int v1 = edges[i][0];
				int v2 = edges[i][1];
				map.get(v1).add(v2);
				map.get(v2).add(v1);
			}
			Stack<Integer> s = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			int c = 0;
			for (int key : map.keySet()) {
				if (visited.contains(key)) {
					continue;
				}
				c++;
				s.push(key);
				while (!s.isEmpty()) {
					// 1. remove
					int rv = s.pop();

					// 2. Ignore if Already Visited
					if (visited.contains(rv)) {
						return false;
					}

					// 3. add visited
					visited.add(rv);
					// 5. Add unvisited nbrs
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {
							s.push(nbrs);
						}
					}
				}

			}
			return c == 1;

		}
	}
}
