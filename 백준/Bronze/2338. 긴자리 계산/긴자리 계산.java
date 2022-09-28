import java.math.BigInteger;
import java.util.Scanner;

// 긴자리 계산
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BigInteger A = scn.nextBigInteger();
		BigInteger B = scn.nextBigInteger();
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));
		scn.close();
	}

}
