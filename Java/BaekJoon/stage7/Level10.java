package stage7;

import java.util.Scanner;

public class Level10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cnt = 0;
		int[] count = new int[100];
		String[] s = new String[100];

		for (int i = 0; i < n; i++) {
			s[i] = scn.next();
			if (s[i].length() == 1)
				count[i]++;
		}

		for (int i = 0; i < n; i++) {	// 단어 개수만큼 루프 돌림
			for (int j = 0; j < s[i].length()-1; j++) {		// 해당 단어의 길이만큼 돌림
				if (s[i].charAt(j) != s[i].charAt(j+1)) {
					for (int k = j+1; k < s[i].length(); k++) {
						if (s[i].charAt(j) == s[i].charAt(k)) {
							count[i] = 0;
							j = s[i].length()-1;
							break;
						}
						else {
							count[i]++;
						}
					}
				}
				else if (s[i].charAt(j) == s[i].charAt(j+1)) {	// 모두같은 문자 일때
					count[i]++;
				}
				else 
					break;
			}
		}

		for (int i = 0; i < n; i++) {
			if (count[i] != 0)
				cnt++;
		}

		System.out.println(cnt);
		scn.close();
	}

}
