import java.util.Scanner;

// BigNumber
// BigInteger사용하면 시간초과
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		long tmp = 0;
		for (int i = 0; i < s.length(); i++) {
			tmp = (tmp * 10 + (s.charAt(i)-'0')) % 20000303;
		}
		System.out.println(tmp);
		scn.close();
	}

}
