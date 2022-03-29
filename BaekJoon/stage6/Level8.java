package stage6;

import java.util.Scanner;

public class Level8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char[] c = new char['Z'-'A' + 1];
		int[] n = new int['Z'-'A' + 1];
		int time = 3;
		int sum = 0, cnt = 0, Ncnt = 0;

		for (int j = 0; j < s.length(); j++) {
			for (int i = 'A'; i <= 'Z'; i++) {
				c[i-'A'] = (char)i;
				if(s.charAt(j) == i) {
					n[i-'A']++;
				}
			}
		}

		for (int i = 0; i < 'Z'-'A'; i+=3) {	// Z = 90, A = 65;
			if (c[i] != 'P' && c[i] != 'W') {
				while(cnt < Ncnt + 3) {
					if(n[cnt] != 0)
						sum += n[cnt] * time;
					cnt++;
				}
				Ncnt += 3;
				time++;
			}
			else {
				while(cnt < Ncnt + 4) {
					if(n[cnt] != 0)
						sum += n[cnt] * time;
					cnt++;
				}
				Ncnt += 4;
				time++;
				i++;
			}
		}
		System.out.println(sum);
		scn.close();
	}
}
