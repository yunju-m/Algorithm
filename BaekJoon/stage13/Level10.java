package stage13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 패션왕 신해빈
public class Level10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();

		for (int i = 0; i < T; i++) {
			int n = scn.nextInt();
			Map<String, Integer> map = new HashMap<>();

			for (int j = 0; j < n; j++) {
				String cloth = scn.next(), type = scn.next();
				if (map.containsKey(type))
					map.put(type, map.get(type)+1);
				else
					map.put(type, 1);
			}
			int result = 1;
			for (int val : map.values()) {
				result *= val + 1;
			}
			System.out.println(result-1);
		}
		scn.close();
	}
}
