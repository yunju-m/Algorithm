package stage10;

import java.util.Scanner;

// 모든 사람을 비교하여 덩치 등수를 구하는 문제
public class Level3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int arr[][] = new int [N][N];
		int i, j;
		// N명의 키와 몸무게를 입력받는다.
		for (i = 0; i < N; i++) {
			arr[i][0] = scn.nextInt();
			arr[i][1] = scn.nextInt();
		}

		// 등수를 매긴다.
		for (i = 0; i < N; i++) {
			int rank = 1;
			for(j = 0; j < N; j++) {
				if (i==j) continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank+" ");
		}
		
		scn.close();
	}
}
