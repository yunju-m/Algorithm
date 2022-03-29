package stage5;

import java.util.Scanner;
// 각 자리수가 등차수열을 이루면 한수이고 
// 한수를 찾는 프로그램
// 예) 123
public class Level3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int total = han(n);
		System.out.println(total);
		scanner.close();
	}

	public static int han(int n) {
		int cnt = 99;	
		if(n <= 99)		// 1~99 -> 한자리, 두자리수는 무조건 한수.
			return cnt = n;
		else {
			for (int i = 100; i <= n; i++) {
				int one = i % 10;
				int ten = i / 10 % 10;
				int bak = i / 100;
				if (bak - ten == ten - one)
					cnt++;
			}
		}
		return cnt;
	}
}
