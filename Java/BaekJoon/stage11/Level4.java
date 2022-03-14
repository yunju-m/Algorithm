package stage11;

import java.util.Scanner;

// 체스판을 만드는 모든 경우를 시도하여 최적의 방법을 찾는 문제
public class Level4 {
	public static boolean[][] arr;
	public static int min = 64;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();	// 세로
		int M = scn.nextInt();	// 가로

		arr = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String s = scn.next();
			for (int j = 0; j < M; j++) {
				if (s.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}

		int N_row = N-7;
		int M_col = M-7;

		for (int i = 0; i < N_row; i++) {
			for (int j = 0; j < M_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
		scn.close();
	}

	public static void find (int x, int y) {
		int end_x = x+8;
		int end_y = y+8;
		int cnt = 0;

		boolean TF = arr[x][y];	// 첫 번째 칸의 색

		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
				// 올바른 색이 아닐경우 count 1 증가
				if (arr[i][j] != TF) {
					cnt++;
				}
				TF = (!TF);
			}
			TF = !TF;
		}
		cnt = Math.min(cnt, 64-cnt);
		min = Math.min(min, cnt);
	}

}
