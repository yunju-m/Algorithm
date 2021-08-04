package stage7;

import java.util.Scanner;

public class Level4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		char[] ch = new char[1000];

		for (int i = 0; i < size; i++) {
			int sNum = scn.nextInt();
			String s = scn.next();

			// 문자열 분리
			for (int k = 0; k < s.length(); k++) {
				ch[k] = s.charAt(k);
				// 문자열 출력
				for (int j = 0; j < sNum; j++) {
					System.out.print(ch[k]);
				}
			}
			System.out.println();
		}
		scn.close();
	}
}
