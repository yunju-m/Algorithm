package stage11;

import java.util.Arrays;
import java.util.Scanner;

// 좌표 정렬하기2
public class Level7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = scn.nextInt();
			arr[i][1] = scn.nextInt();
		}

		Arrays.sort(arr, (e1, e2)->{
			if (e1[1] == e2[1]) {
				return e1[0]-e2[0];
			} else {
				return e1[1]-e2[1];
			}
		});

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		scn.close();
	}
}
