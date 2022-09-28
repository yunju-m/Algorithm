import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 오큰수
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();

		int N = Integer.parseInt(br.readLine());
		int[] seq = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < seq.length; i++) {
			while (!stack.empty() && seq[stack.peek()] < seq[i]) {
				seq[stack.pop()] = seq[i];
			}
			stack.push(i);
		}
		while(!stack.empty()) {			// stack 비어있지않은 것은 -1로 설정
			seq[stack.pop()] = -1;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < seq.length; i++) {
			sb.append(seq[i]).append(' ');
		}
		System.out.println(sb);
	}
}