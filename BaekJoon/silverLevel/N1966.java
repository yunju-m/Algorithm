package silverLevel;

import java.util.LinkedList;
import java.util.Scanner;

// 프린터 큐
public class N1966 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = scn.nextInt();
		int N, M, count = 0;
		for (int i = 0; i < T; i++) {
			N = scn.nextInt();
			M = scn.nextInt();
			LinkedList<int[]> q = new LinkedList<>();

			for(int j = 0; j < N; j++) {
				q.offer(new int[] { j, scn.nextInt()});	// {초기위치, 중요도}
			}
			count = 0;
			while (!q.isEmpty()) {
				int[] front = q.poll();
				boolean isMax = true;	// 큰원소 찾기
				for (int j = 0; j < q.size(); j++) {
					if (front[1] < q.get(j)[1]) {
						q.offer(front);
						for (int k = 0; k < j; k++) {
							q.offer(q.poll());
						}
						isMax = false;
						break;
					}
				}
				if (isMax == false) continue;
				count++;
				if (front[0] == M) break;
			}
			sb.append(count).append('\n');
		}
		System.out.println(sb);
		scn.close();
	}
}
