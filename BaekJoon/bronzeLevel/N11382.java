package bronzeLevel;

import java.math.BigInteger;
import java.util.Scanner;

// 꼬마 정민
public class N11382 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BigInteger A = scn.nextBigInteger();
		BigInteger B = scn.nextBigInteger();
		BigInteger C = scn.nextBigInteger();
		BigInteger sum = A.add(B).add(C);
		System.out.println(sum);
		scn.close();
	}

}
