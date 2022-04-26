package stage12;

import java.util.Scanner;

// 이항 계수 2
public class Level7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int result;
		result = factorial(N)/(factorial(K)*factorial(N-K));
		System.out.println(result%10007);
		scn.close();
	}

	public static int factorial(int n) {
		int sum = 1;
		int size = n;
		for (int i = 0; i < size; i++) {
			sum *= n;
			n--;
		}
		return sum;
	}
}
