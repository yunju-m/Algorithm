package stage9;

import java.util.Scanner;
// 재귀함수로 별 찍기
public class Level4 {
	static char [][] arr;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		arr = new char[N][N];
		star(N, 0, 0, false);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
		scn.close();
	}

	public static void star(int N, int x, int y, boolean blank) {
		if (blank) {
			for (int i = x; i < x+N; i++) {
				for (int j = y; j < y+N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		if (N==1) {
			arr[x][y] = '*';
			return;
		}
		
		/*
		 * N = 27 인 경우 한 블록의 사이즈는 9이고,
		 * N = 9인 경우 한 블록의 사이즈는 3이듯
		 * 해당 블록의 한 칸을 담을 변수의 의미 size
		 * 
		 * count는 별 출력 누적 합을 의미하는 변수
		 */
		
		int size = N/3;
		int count = 0;
		for (int i = x; i < x+N; i += size) {
			for (int j = y; j < y+N; j += size) {
				count++;
				if (count == 5) {
					star(size, i, j, true);
				}
				else {
					star(size, i, j, false);
				}
			}
		}
	}
}
