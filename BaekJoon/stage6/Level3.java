package stage6;

import java.util.Scanner;

public class Level3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char[] c = new char[s.length()];
		int[] Nc = new int['z' - 'a' + 1];
		int cnt = 0;

		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}

		for (int i = 'a'; i <= 'z'; i++) {
			Nc[i-'a'] = -1;
		}

		for(int j = 0; j < s.length(); j++){
			for (int i = 'a'; i <= 'z'; i++) {
				if(c[j] == (char)i) {
					if(Nc[i-'a'] == -1) {
						Nc[i-'a'] = cnt;
						cnt++;
						break;
					}
					else {
						cnt++;
						break;
					}
				}
			}
		}

		for (int i = 'a'; i <= 'z'; i++) {
			System.out.print(Nc[i-'a'] + " ");
		}
		scn.close();
	}
}
