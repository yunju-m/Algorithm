package stage13;

import java.util.Scanner;

// 백트레킹
// N과 M(1)
public class Level1 {
	public static int[] arr;
	public static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), M = scn.nextInt();
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
		scn.close();
	}

	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (visit[i] == false) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(N, M, depth+1);
				
				visit[i] = false;
			}
		}
		return;
	}
}