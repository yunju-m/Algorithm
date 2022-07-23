package bronzeLevel;

import java.util.Scanner;

// 별찍기 -4
public class N2441 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = N; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		scn.close();
	}

}
