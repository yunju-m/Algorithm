package bronzeLevel;

import java.util.Scanner;

// 시험점수
public class N5596 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int S = 0;
		int T = 0;
		for (int i = 0; i < 4; i++) {
			S+= scn.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			T+=scn.nextInt();
		}
		System.out.println(Math.max(S, T));
		scn.close();
	}
}
