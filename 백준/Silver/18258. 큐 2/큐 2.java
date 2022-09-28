import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 큐2
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int x=0, num;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			if (s.equals("push")) {
				x = Integer.parseInt(st.nextToken());
				q.add(x);
			} else if (s.equals("pop")) {
				if (q.isEmpty()) sb.append(-1).append('\n');
				else {
					num = q.poll();
					sb.append(num).append('\n');
				}
			} else if (s.equals("size")) {
				sb.append(q.size()).append('\n');
			} else if (s.equals("empty")) {
				if (q.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
			} else if (s.equals("front")) {
				if (q.isEmpty()) sb.append(-1).append('\n');
				else {
					sb.append(q.peek()).append('\n');
				}
			} else if (s.equals("back")) {
				if (q.isEmpty())sb.append(-1).append('\n');
				else {
					sb.append(x).append('\n');
				}
			}
		}
		System.out.println(sb);
	}
}
