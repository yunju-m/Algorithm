package stage8;

import java.util.Scanner;

public class Level9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();	// Test case
		long x, y, distance, max;

		for (int i = 0; i < T; i++) {
			x = scn.nextInt();	// 현재 위치
			y = scn.nextInt();	// 목표 위치	
			distance = y - x;
			max = (int)Math.sqrt(distance);	// 제곱근

			// 0~1, 0~4, 0~9
			if (max == Math.sqrt(distance)) {
				System.out.println(2*max-1);
			}
			// 0~2, 0~5, 0~6
			else if (Math.sqrt(distance) - max <= 0.5) {
				System.out.println(2*max);
			}
			// 0~3, 0~7, 0~8
			else
				System.out.println(2*max+1);
		}
		scn.close();
	}

}
