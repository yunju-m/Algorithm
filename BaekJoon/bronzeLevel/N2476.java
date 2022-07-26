package bronzeLevel;

import java.util.Scanner;

// 주사위 게임
public class N2476 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int num1, num2, num3, sum = 0, result = 0;
		for (int i = 0; i < N; i++) {
			num1 = scn.nextInt();
			num2 = scn.nextInt();
			num3 = scn.nextInt();
			if (num1 == num2 || num2 == num3 || num1 == num3) {
				if (num1 == num2 && num1 == num3) {
					sum = 10000 + num1 *1000;
				} else {
					if (num1 == num2 || num1 == num3)
						sum = 1000 + num1 * 100;
					else sum = 1000 + num2 * 100;
				}
			} else {
				 int max = Math.max(num1, Math.max(num2, num3));
				 sum = max * 100;
			}
			result = Math.max(result, sum);
		}
		System.out.println(result);
		scn.close();
	}
}
