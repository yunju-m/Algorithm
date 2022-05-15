package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 인사성 밝은 곰곰이
public class Beartest2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap <String, Integer> map = new HashMap<>();
		int cnt = 0;		// 곰곰티콘 사용횟수
		String s;
		for (int i = 0; i < N; i++) {
			s = br.readLine();
			if (s.equals("ENTER")) {
				cnt += map.size();
				map = new HashMap<>();
			}
			else {
				map.put(s, 0);
			}
		}
		cnt += map.size();
		System.out.println(cnt);
	}

}
