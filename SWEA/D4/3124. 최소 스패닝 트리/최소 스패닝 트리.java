import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {
	static int V, E;

	static class Edge implements Comparable<Edge>{
		int v, w;

		Edge(int e, int v) {
			this.v = e;
			this.w = v;
		}

		@Override
		public int compareTo(Edge o) {
			return this.w - o.w;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			boolean[] visited = new boolean[V];

			List<Edge>[] edgeList = new ArrayList[V];

			for (int i = 0; i < V; i++) {
				edgeList[i] = new ArrayList<Edge>();
			}

			for (int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				int from = Integer.parseInt(st.nextToken())-1;
				int to = Integer.parseInt(st.nextToken())-1;
				int weight = Integer.parseInt(st.nextToken());

				// edgeList 출발idx에 목적idx와 가중치
				edgeList[from].add(new Edge(to, weight));
				edgeList[to].add(new Edge(from, weight));
			}

			// pq 선언, (v, w)로 넣어주고 w에 따라 정렬
			PriorityQueue<Edge> pq = new PriorityQueue<Edge>();

			// 가중치 더하다보면 int 넘어가므로 long으로 선언
			long result = 0;
			int cnt = 0;
			visited[0] = true;

			// 0과 연결된 간선들 pq에 넣어주기
			for (Edge e : edgeList[0]) {
				pq.add(e);
			}
			// pq에 가중치가 작은 간선들부터 탐색
			while (!pq.isEmpty()) {
				Edge cur = pq.poll();
				if (visited[cur.v]) continue;
				result += cur.w;
				visited[cur.v] = true;

				if (cnt++ == V-1) break;
				for (Edge e: edgeList[cur.v]) {
					if (visited[e.v]) continue;
					pq.add(e);
				}
			}
			sb.append("#").append(tc).append(" ").append(result).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
