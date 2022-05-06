package stage13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 조합 0의 개수 (소인수분해 이용)
public class Level12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
		// 각각의 승수를 구해준다.
		long count5 = fiveCount(n) - fiveCount(n-m) - fiveCount(m);
		long count2 = twoCount(n) - twoCount(n-m) - twoCount(m);
		System.out.println(Math.min(count5, count2));
	}

	public static int fiveCount(long num) {
		int cnt = 0;
		while (num != 0) {
			cnt += (num/5); 
			num = num/5;
		}
		return cnt;
	}

	public static int twoCount(long num) {
		int cnt = 0;
		while (num != 0) {
			cnt += (num/2);
			num = num/2;
		}
		return cnt;
	}
}