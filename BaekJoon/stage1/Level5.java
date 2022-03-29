package stage1;

import java.util.Scanner;
public class Level5 {
	public static void main(String[] args) {
		int A, B;
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextInt();
		B = scanner.nextInt();
		int sum = A + B;
		System.out.println(sum);
		scanner.close();
	}
}
