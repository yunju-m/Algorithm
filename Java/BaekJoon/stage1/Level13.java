package stage1;

import java.util.Scanner;
public class Level13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int num = B % 100 % 10;
		int num2 = B % 100 - num;
		int num3 = B - num2 - num;
		int sum1 = A * num;
		System.out.println(sum1);
		int sum2 = A * num2;
		System.out.println(sum2/10);
		int sum3 = A * num3;
		System.out.println(sum3/100);
		System.out.println(sum1 + sum2 + sum3);
		scanner.close();
	}
}
