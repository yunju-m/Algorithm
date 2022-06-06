package bronzeLevel;

import java.util.Scanner;

// 행렬 덧셈
public class N2738 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = scn.nextInt(), M = scn.nextInt();
		int[][] arr1 = new int[N][M];
		int[][] arr2 = new int[N][M];
		for (int l = 0; l < 2; l++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (l == 0) arr1[i][j] = scn.nextInt();
					else arr2[i][j] = scn.nextInt();
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sb.append(arr1[i][j] + arr2[i][j]).append(" ");
				if (j == M-1) sb.append('\n');
			}
		}
		System.out.println(sb);
		scn.close();
	}

}
