package stage9;

import java.util.Scanner;

// 골드바흐의 추측
public class Level6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();	// 테스트 케이스 개수
		int[] Arr;
		for (int i = 0; i < T; i++) {
			int n = scn.nextInt();
			Arr = new int [n+1];
			for (int a = 0; a < n; a++) {
				Arr[a] = 0;
			}
			Arr[1] = 1;

			// 소수구하기
			for (int j = 2; j < n; j++) {
				for (int k = 2; k*j <= n; k++) {
					Arr[k*j] = 1;
				}
			}

			int m = 0;
			int dif = n;
			int M=0, L=0;
			// 두 소수의 합 구하기
			for (int l = 2; l <= n/2; l++) {
				if(Arr[l]==0) {
					m = n-l;
					if(Arr[m]==0) {
						if (dif >= m-l) {
							dif = m-l;
							M = m; L = l;
						}
					}
				}
			}
			System.out.println(L + " " + M);
		}
		scn.close();
	}
}