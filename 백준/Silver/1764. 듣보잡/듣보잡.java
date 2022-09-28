import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

// 듣보잡
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> arr = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), 0);
		}
		int cnt = 0;	// 포함 개수
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (map.containsKey(s)) {
				arr.add(s);
				cnt++;
			}
		}
		Collections.sort(arr);
		System.out.println(cnt);
		for (int i = 0; i < arr.size(); i++)
			System.out.println(arr.get(i));
	}

}
