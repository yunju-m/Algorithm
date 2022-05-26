package silverLevel;

import java.util.Scanner;
import java.util.Stack;

// 제로
public class N10773 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int K = scn.nextInt();
		int n, sum = 0;
		for (int i = 0; i < K; i++) {
			n = scn.nextInt();
			if (n==0) stack.pop();
			else stack.push(n);
		}

		for (int i = 0; i < stack.size(); i++) {
			sum += stack.get(i);
		}
		System.out.println(sum);
		scn.close();
	}

}
