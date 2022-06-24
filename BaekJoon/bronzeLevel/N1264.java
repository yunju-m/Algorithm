package bronzeLevel;

import java.util.Scanner;

// 모음의 개수
public class N1264 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s;
		int cnt;
		char[] c = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		while (true) {
			s = scn.nextLine();
			cnt = 0;
			if (s.equals("#")) break;
			else {
				for (int i = 0; i < s.length(); i++) {
					for (int j = 0; j < c.length; j++) {
						if (s.charAt(i) == c[j]) {
							cnt++;
							break;
						}
					}
				}
			}
			System.out.println(cnt);
		}
		scn.close();
	}
}
