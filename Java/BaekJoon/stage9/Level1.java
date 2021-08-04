package stage9;

import java.util.Scanner;
// 소수 구하기1
public class Level1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int primeN, sum = 0, prime;
		for (int i = 0; i < N; i++) {
			primeN = scn.nextInt();
			prime = 0;
			for (int j = 2; j < primeN; j++) {
				if (primeN % j == 0) {
					prime++;
					break;
				}
			}
			if (primeN != 1)
				if (prime == 0)
					sum++;
		}
		System.out.println(sum);
		scn.close();
	}
}
