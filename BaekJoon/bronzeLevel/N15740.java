package bronzeLevel;

import java.math.BigInteger;
import java.util.Scanner;

public class N15740 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BigInteger A = scn.nextBigInteger();
		BigInteger B = scn.nextBigInteger();
		System.out.println(A.add(B));
		scn.close();
	}

}
