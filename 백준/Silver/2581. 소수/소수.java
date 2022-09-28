import java.util.Scanner;
// 소수 구하기2
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int M = scn.nextInt(), N = scn.nextInt();
		int sum = 0, j;
		int min = N;
		for (int i = M; i <= N; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (i == j) {
				sum += i;
				if (min > i)
					min = i;
			}
		}
		if (sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else
			System.out.println("-1");
		scn.close();
	}
}