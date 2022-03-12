package stage11;

import java.util.Scanner;

// 체스판을 만드는 모든 경우를 시도하여 최적의 방법을 찾는 문제
public class Level4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();	// 세로
		int M = scn.nextInt();	// 가로
		char[][] arr1 = new char[N][M];
		char[][] arr2 = new char[N][M];
		String s;

		for (int y = 0; y < N; y++) {
			s = scn.next();
			for (int x = 0; x < M; x++) {
				arr1[y][x] = s.charAt(x);
			}
		}
		int num=0;
		if (arr1[0][0] == 'W') {
			for (int y = 0; y < N; y++) {
				for (int x = num; x < M; x+=2) {
					arr2[y][x] = 'W';
				}
				if (num == 0) num = 1;
				else num = 0;
			}
			num = 1;
			for (int y = 0; y < N; y++) {
				for (int x=num; x < M; x+=2) {
					arr2[y][x] = 'B';
				}
				if (num == 0) num = 1;
				else num = 0;
			}
		}

		else {
			for (int y = 0; y < N; y++) {
				for (int x=num; x < M; x+=2) {
					arr2[y][x] = 'B';
				}
				if (num == 0) num = 1;
				else num = 0;
			}
			
			num = 1;
			for (int y = 0; y < N; y++) {
				for (int x = num; x < M; x+=2) {
					arr2[y][x] = 'W';
				}
				if (num == 0) num = 1;
				else num = 0;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (arr1[i][j] != arr2[i][j]) {
					cnt++;
				}
			}
		}
		System.out.print(cnt);
		scn.close();
	}

}
