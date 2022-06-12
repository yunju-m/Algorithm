package bronzeLevel;

import java.math.BigInteger;
import java.util.Scanner;

// 이상한숫자
public class N15964 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BigInteger A = scn.nextBigInteger();
		BigInteger B = scn.nextBigInteger();
		System.out.println(A.add(B).multiply(A.subtract(B)) );
		scn.close();
	}

}
