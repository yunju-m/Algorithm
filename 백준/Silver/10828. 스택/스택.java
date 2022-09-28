import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 스택
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String s;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			s = st.nextToken();
			if (s.equals("push")) {
				int n = Integer.parseInt(st.nextToken());
				stack.push(n);
			} else if (s.equals("pop")) {
				if (stack.empty()) 
					System.out.println(-1);
				else {
					System.out.println(stack.pop());
				}
			} else if (s.equals("size")) {
				System.out.println(stack.size());
			} else if (s.equals("empty")) {
				if(stack.empty()) {
					System.out.println(1);
				} else System.out.println(0);
			} else if (s.equals("top")) {
				if (stack.empty())
					System.out.println(-1);
				else
					System.out.println(stack.peek());
			}
		}

	}

}
