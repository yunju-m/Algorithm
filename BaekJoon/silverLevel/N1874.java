package silverLevel;

import java.util.Scanner;
import java.util.Stack;

// 스택 수열
public class N1874 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n, start=0;
		boolean ok = true;
		for (int i = 0; i < N; i++) {
			n = scn.nextInt();
			if (start < n) {
				for (int j = start+1; j <= n; j++) {
					stack.push(j);
					sb.append('+').append("\n");
				} start = n;
			}
			else if (stack.peek() != n) {
				ok = false;
				break;
			}
			stack.pop();
			sb.append('-').append("\n");
		}

		if (ok == true) System.out.println(sb);
		else System.out.println("NO");
		scn.close();
	}
}