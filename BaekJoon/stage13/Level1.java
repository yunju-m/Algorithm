package stage13;

import java.util.Scanner;

// 백트레킹
// N과 M(1)
public class Level1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), M = scn.nextInt();
		int[][] arr = new int[N][M];
		nmArray(N, M, arr);
		scn.close();
	}



	private static void nmArray(int N, int M, int[][] arr) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = j+1;
			}
		}
	}
}