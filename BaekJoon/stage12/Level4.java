package stage12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 숫자 카드2
public class Level4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> map = new HashMap<>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int cnt;	// 포함 개수

		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if (map.containsKey(n)) {
				cnt = map.get(n);
				map.put(n, ++cnt);
			} else {
				map.put(n, 1);
			}
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");

		for (int i= 0; i < M; i++) {
			int m = Integer.parseInt(st.nextToken());
			if (map.containsKey(m))
				sb.append(map.get(m)).append(" ");
			else sb.append(0).append(" ");
		}
		System.out.println(sb);

	}

}
