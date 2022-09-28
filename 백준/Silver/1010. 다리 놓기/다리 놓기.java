import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다리 놓기 (조합)
public class Main{
	static int[][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken());
		int N, M;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			dp = new int[M+1][N+1];
			System.out.println(binomial(M, N));
		}
	}
	
	public static int binomial(int n, int r) {
		if (dp[n][r] > 0) return dp[n][r];
		if (n==r || r==0) return dp[n][r] = 1;
		return (dp[n][r] = binomial(n-1, r-1) + binomial(n-1, r));
	}
}
