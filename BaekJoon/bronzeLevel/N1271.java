package bronzeLevel;

import java.math.BigInteger;
import java.util.Scanner;

// 엄청난 부자2
public class N1271 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BigInteger n = new BigInteger(scn.next());
		BigInteger m = new BigInteger(scn.next());
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
		scn.close();
	}
}