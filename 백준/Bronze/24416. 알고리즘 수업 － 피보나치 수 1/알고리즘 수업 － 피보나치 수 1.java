import java.util.Scanner;

// 알고리즘 수업 - 피보나치 수 1
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		System.out.println(fib(N) + " " + (N-2));
		scn.close();
	}

	// 재귀함수
	public static int fib(int n) {
		if (n == 0) return 0;
		else if (n == 1 || n == 2) return 1;
		return fib(n-1) + fib(n-2);
	}

	// 동적프로그래밍
	public static int fibonacci(int n) {
		int[] f = new int[101];
		if (n <= 1) return n;
		else if (f[n] != 0) return f[n];
		else {
			return f[n] = fibonacci(n-1) + fibonacci(n-2);
		}
	}
}