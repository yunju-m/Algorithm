import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[][] m = new int[501][501];
		int[] d = new int[1001];

		for (int i = 0; i < n; i++) {
			d[i] = scn.nextInt();
			d[i+1] = scn.nextInt();
		}
		
		System.out.println(chainedMatrix(n, d, m));
		scn.close();
	}
	
	static int chainedMatrix(int n, int[] d, int[][]p) {
		// 동적 프로그래밍
		for (int len = 2; len <= n; len++) {
			for (int i = 1; i <= n-len+1; i++) {
				int j = i + len-1;
				p[i][j] = Integer.MAX_VALUE;
				for (int k = i; k < j; k++) {
					int cost = p[i][k] + p[k+1][j] + d[i-1] * d[k] * d[j];
					p[i][j] = Math.min(p[i][j], cost);
				}
			}
		}
		return p[1][n];
		
	}
}