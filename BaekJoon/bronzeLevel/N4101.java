package bronzeLevel;

import java.util.Scanner;

// 크냐?
public class N4101 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			int n = scn.nextInt();
			if (n == 0) break;
			else {
				int n2 = scn.nextInt();
				if (n > n2) System.out.println("Yes");
				else System.out.println("No");
			}

		}
		scn.close();
	}

}
