import java.math.BigInteger;
import java.util.Scanner;

// 사파리 월드
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BigInteger n = scn.nextBigInteger();
		BigInteger m = scn.nextBigInteger();
		System.out.println(n.subtract(m).abs());
		scn.close();
	}

}
