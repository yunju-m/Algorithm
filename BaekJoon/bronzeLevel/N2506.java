package bronzeLevel;

import java.util.Scanner;

// 점수 계산
public class N2506 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int sum=0, num, k=0;
		for (int i = 0; i < N; i++) {
			num = scn.nextInt();
			if (num == 1) {
				k++;
				sum += k;
			} else k = 0;
		}
		System.out.println(sum);
		scn.close();
	}
}
