package bronzeLevel;

import java.util.Scanner;

// 특별한 날
public class N10768 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int M = scn.nextInt();
		int D = scn.nextInt();
		if (M < 2) System.out.println("Before");
		else if (M == 2) {
			if (D < 18) System.out.println("Before");
			else if (D == 18) System.out.println("Special");
			else System.out.println("After");
		} else System.out.println("After");
		scn.close();
	}
}
