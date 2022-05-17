package stage14;

import java.math.BigInteger;
import java.util.Scanner;

// 팩토리얼 0의 개수
public class Level11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), cnt=0;
		BigInteger remain, N = factorial(n);

		remain = N.remainder(BigInteger.TEN); 
		while (remain.compareTo(BigInteger.ZERO) == 0) {
			cnt++;
			N = N.divide(BigInteger.TEN);
			remain = N.remainder(BigInteger.TEN); 
		}
		System.out.println(cnt);
		scn.close();
	}

	public static BigInteger factorial(int n) {
		if (n == 0 || n == 1) return BigInteger.ONE;
		BigInteger result = BigInteger.valueOf(n);
		for (int i = n; i >= 2; i--) {
			result = result.multiply(BigInteger.valueOf(i-1));
		}
		return result;
	}

}
