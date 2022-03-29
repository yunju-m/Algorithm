package stage7;

import java.util.Scanner;

public class Level1 {
	public static void main(String[] args) {
		int A;	// 고정비용
		int B;	// 가변비용
		int C;	// 노트북 가격

		Scanner scn = new Scanner(System.in);
		A = scn.nextInt();
		B = scn.nextInt();
		C = scn.nextInt();

		if (B < C) {
			System.out.println(A/(C-B) + 1);
		}
		else
			System.out.println(-1);
		
		scn.close();
	}

}
