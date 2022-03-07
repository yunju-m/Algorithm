package stage2;

import java.util.Scanner;
public class Level6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();
		if (B+C > 59) {
			B = B+C-60;
			A++;
			if (A > 23) {
				A = 0;
			}
			while(B > 59) {
				B = B-60;
				A++;
				if (A > 23) {
					A = 0;
				}
			}
		}
		else {
			B += C;
		}
		System.out.println(A + " " + B);
		scn.close();
	}
}
