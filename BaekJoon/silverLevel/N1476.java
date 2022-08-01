package silverLevel;

import java.util.Scanner;

// 날짜계산
public class N1476 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int E = scn.nextInt();
		int S = scn.nextInt();
		int M = scn.nextInt();
		int e = 1, s = 1, m = 1;
		for (int i = 1; ; i++) {
			if (e == E && s == S && m == M) {
				System.out.println(i);
				break;
			}
			if (e >= 15) e = 0;
			if (s >= 28) s = 0;
			if (m >= 19) m = 0;
			e++; s++; m++;
		}
		scn.close();
	}
}
