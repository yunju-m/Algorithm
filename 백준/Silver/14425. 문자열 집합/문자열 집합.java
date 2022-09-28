import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 문자열 집합
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashMap<String, Integer> map = new HashMap<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), 0);
		}
		int cnt = 0;
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (map.keySet().contains(s)) cnt++; 
		}
		System.out.println(cnt);
	}

}
