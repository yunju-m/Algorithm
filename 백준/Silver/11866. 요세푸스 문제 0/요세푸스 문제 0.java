import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 요세푸스 문제0
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		int cnt = 0; int n;
		int size = queue.size();
		while(!queue.isEmpty()) {
			for (int i = 1; i <= size; i++) {
				cnt++;
				if (cnt == K) {
					n = queue.poll();
					sb.append(n);
					cnt = 0;
					if (queue.size()!=0)
						sb.append(", ");
				} else {
					n = queue.poll();
					queue.offer(n);
				}
			}
			size = queue.size();
		}
		System.out.println(sb.append(">"));
		scn.close();
	}

}
