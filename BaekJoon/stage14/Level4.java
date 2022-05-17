package stage14;

import java.util.Scanner;
// 최고공배수 구하기(유클리드 호재법 알고리즘 이용)
public class Level4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scn.nextInt();
			int M = scn.nextInt();
			int tmp;
			int num1 = N, num2 = M;
			while (num2!=0) {
				tmp = num1 % num2;
				num1 = num2;
				num2 = tmp;
			}
			num2 = num1 * (N/num1) * (M/num1);
			System.out.println(num2);
		}
		scn.close();
	}
}