package silverLevel;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

// 괄호
public class N9012 {
	public static void main(String[] args) throws IOException{
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		String s; char c;
		for (int i = 0; i < T; i++) {
			s = scn.next();
			for (int j = 0; j <s.length(); j++) {
				c = s.charAt(j);
				if (c == '(') {
					stack.push("(");
				} else {
					if (stack.empty()) {
						stack.push(")");
						break;
					}
					stack.pop();
				}
			}
			if (stack.empty()) sb.append("YES").append('\n');
			else sb.append("NO").append('\n');
			stack.clear();
		}
		System.out.println(sb);
		scn.close();
	}
}
