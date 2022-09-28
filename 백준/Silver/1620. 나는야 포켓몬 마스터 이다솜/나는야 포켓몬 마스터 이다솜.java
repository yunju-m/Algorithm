import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 나는야 포켓몬 마스터 이다솜
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); 		// 도감의 수록된 포캣몬 개수
		int M = Integer.parseInt(st.nextToken());		// 찾아야하는 포켓몬 개수
		StringBuilder sb = new StringBuilder();
		HashMap<String, Object> map = new HashMap<>();
		HashMap<Integer, Object> numap = new HashMap<>();
		String s;
		for (int i = 0; i < N; i++) {
			s = br.readLine();
			map.put(s, i+1);
			numap.put(i+1, s);
		}
		for (int i = 0; i < M; i++) {
			s = br.readLine();
			if (map.containsKey(s)) {
				sb.append(map.get(s)).append("\n");
			}
			else {
				int num = Integer.parseInt(s);
				sb.append(numap.get(num)).append("\n");
			}
		}
		System.out.println(sb);

	}

	// value값과 동일한 키 찾기 -> 시간초과 발생
	//	public static <K, V> K getKey(Map<K, V> map, V value) {
	//		for (K key : map.keySet()) {
	//			if (value.equals(map.get(key))) {
	//				return key;
	//			}
	//		}
	//		return null;
	//	}

}
