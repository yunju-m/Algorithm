import java.util.Scanner;
import java.util.Arrays;
class Solution
{
	static int N, B, min;
	static boolean[] visited;
	static int[] h;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			B = sc.nextInt();
			h = new int[N];         
			for (int i = 0; i < N; i++){
				h[i] = sc.nextInt();
			}
			min = Integer.MAX_VALUE;
			visited = new boolean[N];
			Arrays.fill(visited, false);
			dfs(0, 0);
			System.out.println("#" + test_case + " " + (min-B));
		}
		sc.close();
	}

	public static void dfs(int idx, int sum) {
		if (sum >= min) return;
		if (idx >= N) {
			if (sum >= B) {
				min = sum;
			}
			return;
		}
		visited[idx] = true;
		dfs(idx+1, sum + h[idx]);
		visited[idx] = false;
		dfs(idx+1, sum);			
	}
}