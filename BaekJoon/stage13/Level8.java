package stage13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이항 계수 2 (동적계획법)
public class Level8 {
	static int [][] dp;
	static int div = 10007;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		dp = new int[N+1][K+1];
		System.out.println(binomial(N, K));
	}

	public static int binomial(int n, int k) {
		if (dp[n][k] > 0) return dp[n][k];
		if (n==k || k==0) return dp[n][k] = 1;
		return dp[n][k] = (binomial(n-1, k-1) + binomial(n-1, k))%div;
	}
}
