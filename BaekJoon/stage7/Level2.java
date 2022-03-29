package stage7;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cnt = 1;
		int num = 0;
		int sum = 0;

		if (n == 1)
			System.out.println(cnt);

		else {
			while(true) {
				if (6 * sum + 1 >= n) {
					System.out.println(cnt);
					break;
				}
				else {
					num++;
					sum = sum + num;
					cnt++;
				}
			}
		}
		scn.close();
	}

}
