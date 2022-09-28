import java.util.Scanner;

// 이항 계수 1
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int result;
		result = factorial(N, K);
		System.out.println(result);
		scn.close();
	}

	public static int factorial(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		}
		else return factorial(n-1, k) + factorial(n-1, k-1);		
	}
}
