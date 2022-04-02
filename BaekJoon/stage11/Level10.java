package stage11;

import java.util.Arrays;
import java.util.Scanner;

// 좌표 압축
// 입력받은 수에서 작은 수가 몇개인지 각각 출력하는 문제
public class Level10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[][] arr = new int[N][2];
		int[] s = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i][0] = scn.nextInt();
			s[i] = arr[i][0];
		}
		Arrays.sort(s);

		int cnt = 0;			// 작은 값 개수 확인
		boolean multi = false;	// 중복 여부 확인

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (s[i]==arr[j][0]) {
					if (multi == false) {
						arr[j][1] = cnt;
					} else {
						multi = false;
					}
					if (i+1 < N) {
						if (s[i] == s[i+1]) {
							multi = true;
						} else {
							cnt++;
						}
					}
				}
			}
		}


		for (int i = 0; i < N; i++) {
			System.out.print(arr[i][1] + " ");
		}
		scn.close();
	}

}
