import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 대칭 차집합
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashMap<Integer, Integer> map = new HashMap<>();
		int aSize = Integer.parseInt(st.nextToken());
		int bSize = Integer.parseInt(st.nextToken());
		int cnt = 0; // 공집합 개수

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < aSize; i++) {
			map.put(Integer.parseInt(st.nextToken()), 0);
		}

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < bSize; i++) {
			if (map.containsKey(Integer.parseInt(st.nextToken()))) {
				cnt++;
			}
		}
		System.out.println(aSize-cnt + (bSize-cnt));
	}

}
