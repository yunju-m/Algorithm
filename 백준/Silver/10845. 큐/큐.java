import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 큐
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Queue<Integer> q = new LinkedList<>();
		String s;
		int lastn = 0;
		int n = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			s = st.nextToken();
			if (s.equals("push")) {
				lastn = Integer.parseInt(st.nextToken());
				q.offer(lastn);
			} else if (s.equals("pop")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				} else {
					n = q.poll();
					System.out.println(n);
				}
			} else if (s.equals("size")) {
				System.out.println(q.size());
			} else if (s.equals("empty")) {
				if (q.isEmpty()) System.out.println(1);
				else System.out.println(0);
			} else if (s.equals("front")) {
				if (q.isEmpty()) System.out.println(-1);
				else System.out.println(q.peek());
			} else if (s.equals("back")) {
				if (q.isEmpty()) System.out.println(-1);
				else System.out.println(lastn);
			}
		}
	}
}
