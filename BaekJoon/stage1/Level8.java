package stage1;

import java.util.Scanner;
public class Level8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextInt();
		double B = scanner.nextInt();
		double sum = A/B;
		System.out.println(sum);
		scanner.close();
	}
}
