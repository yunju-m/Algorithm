package stage2;

import java.util.Scanner;
public class Level1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		if(A > B)
			System.out.println('>');
		else if(A < B)
			System.out.println('<');
		else
			System.out.println("==");
		scanner.close();
	}
}
