import java.util.Scanner;
// 소수 구하기
// 에스토스테네스체 사용
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int M = scn.nextInt(), N = scn.nextInt();
		getPrime(M, N);

		scn.close();
	}

	public static void getPrime(int m, int n) {
		int[] primeChk = new int[n+1];
		primeChk[0] = primeChk[1] = 1;

		for (int i = 2; i <=n; i++) {
			for (int j = 2; i*j<=n; j++) {
				primeChk[i*j] = 1;
			}
		}
		for (int i = m; i <= n; i++) {
			if (primeChk[i] != 1)
				System.out.println(i);
		}
	}
}