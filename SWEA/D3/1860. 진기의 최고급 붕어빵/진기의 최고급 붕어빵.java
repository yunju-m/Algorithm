import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int N, M, K;
	static int[] guest;

	static String isPossible() {
		int fishbread = 0; 
		int idx = 0; 
		int time = 0;
		while (true) {
			while (time + M > guest[idx]) {
				if (fishbread-- == 0) {
					return "Impossible";
				}
				if (idx++ >= N - 1) {
					return "Possible";
				}
			}
			time += M;
			fishbread += K;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			N = sc.nextInt(); 
			M = sc.nextInt(); 
			K = sc.nextInt(); 
			guest = new int[N];
			for (int i = 0; i < N; i++) {
				guest[i] = sc.nextInt();
			}
			Arrays.sort(guest); 

			System.out.printf("#%d %s\n", t, isPossible());
		}

	}
}