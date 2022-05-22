package silverLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

// 덱
public class N10866 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		StringTokenizer st;
		String s; int n = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			s = st.nextToken();
			if (s.equals("push_front")) {
				deque.addFirst(Integer.parseInt(st.nextToken()));
			} else if (s.equals("push_back")) {
				deque.addLast(Integer.parseInt(st.nextToken()));
			} else if (s.equals("pop_front")) {
				if (deque.isEmpty()) System.out.println(-1);
				else {
					n = deque.pollFirst();
					System.out.println(n);
				}
			} else if (s.equals("pop_back")) {
				if (deque.isEmpty()) System.out.println(-1);
				else {
					n = deque.pollLast();
					System.out.println(n);
				}
			} else if (s.equals("size")) {
				System.out.println(deque.size());
			} else if (s.equals("empty")) {
				if (deque.isEmpty()) System.out.println(1);
				else System.out.println(0);
			} else if (s.equals("front")) {
				if (deque.isEmpty()) System.out.println(-1);
				else {
					System.out.println(deque.peekFirst());
				}
			} else if (s.equals("back")) {
				if (deque.isEmpty()) System.out.println(-1);
				else System.out.println(deque.peekLast());
			}
		}
	}
}
