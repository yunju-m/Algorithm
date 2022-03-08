package stage10;

import java.util.Scanner;

// 재귀함수를 이용한 피보나치 수
public class Level2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int result = fibo(n);
		System.out.println(result);
		scn.close();
	}

	public static int fibo(int n) {
		if (n==0) return 0;
		else if (n==1) return 1;
		else return fibo(n-1)+fibo(n-2);
	}
}
