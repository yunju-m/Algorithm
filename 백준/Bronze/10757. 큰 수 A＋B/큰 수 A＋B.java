import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BigInteger A = new BigInteger(scn.next());
		BigInteger B = new BigInteger(scn.next());
		
		A = A.add(B);
		System.out.println(A.toString());
		scn.close();
	}
}