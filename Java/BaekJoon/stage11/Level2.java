package stage11;

import java.util.Scanner;

// 모든 경우를 시도하여 N의 생성자를 구하는 문제
public class Level2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String strN = scn.nextLine();
		int N_len = strN.length();
		int N = Integer.parseInt(strN);
		int result=0;
		for (int i = (N-(N_len*9)); i < N; i++) {
			int number = i;
			int sum = 0;
			
			while(number!=0) {
				sum += number%10;
				number /= 10;
			}
			if (i+sum==N) {
				result = i;
				break;
			}
		}
		System.out.print(result);
		scn.close();
	}
}
