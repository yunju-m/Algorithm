import java.util.Scanner;

// 백트래킹
// N과 M(3)
public class Main {
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		N = scn.nextInt();
		M = scn.nextInt();
		arr = new int[M];
		dfs(0);
		System.out.print(sb);
		scn.close();
	}

	public static void dfs(int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] +" ");
			}
			sb.append('\n');
			return;
		}
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth+1);
		}
	}

}
