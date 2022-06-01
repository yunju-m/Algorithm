package bronzeLevel;

import java.util.Scanner;

// Hashing
public class N15829 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int L = scn.nextInt();
		String s = scn.next();
		long r = 1;
		long sum = 0;
		long M = 1234567891;
		for (int i = 0; i < L; i++) {
			sum += ((s.charAt(i)-'a'+1) * r) % M;
			r = ((31*r) % M);
		}
		System.out.println(sum%M);
		scn.close();
	}
}
