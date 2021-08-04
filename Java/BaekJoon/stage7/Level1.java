package stage7;

import java.util.Scanner;

public class Level1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		int n = (int)c;
		System.out.println(n);
		scanner.close();
	}
}
