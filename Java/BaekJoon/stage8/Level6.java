package stage8;

import java.util.Scanner;

public class Level6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();	// Test case
		int cnt = 0;

		while(cnt < T) {
			int k = scn.nextInt();	// 층
			int n = scn.nextInt();	// 호
			int[][] karr = new int[k+1][n+1];

			// 0층의 i호는 i명 산다
			for (int i = 1; i <= n; i++) {
				karr[0][i] = i;
			}
			
			// i층의 j호 = i-1층의 j호 + i층의 j-1호 
			for (int i = 1; i <= k; i++) {
				for (int j = 1; j <= n; j++) {
					karr[i][j] = karr[i-1][j] + karr[i][j-1];
				}
			}
			cnt++;
			System.out.println(karr[k][n]);
		}
		scn.close();
	}
}
