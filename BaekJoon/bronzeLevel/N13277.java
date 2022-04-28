package bronzeLevel;

import java.math.BigInteger;
import java.util.Scanner;

// 큰 수 곱셈
public class N13277 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BigInteger A = scn.nextBigInteger();
		BigInteger B = scn.nextBigInteger();
		System.out.println(A.multiply(B));
		scn.close();
	}

}
