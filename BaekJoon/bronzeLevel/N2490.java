package bronzeLevel;

import java.util.Scanner;

// 윷놀이
public class N2490 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int sum;
		for (int i = 0; i < 3; i++) {
			sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += scn.nextInt();
			}
			if (sum == 3) sb.append('A').append('\n');
			else if (sum == 2) sb.append('B').append('\n');
			else if (sum == 1) sb.append('C').append('\n');
			else if (sum == 0) sb.append('D').append('\n');
			else sb.append('E').append('\n');
		}
		System.out.println(sb);
		scn.close();
	}

}
