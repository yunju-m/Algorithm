package stage1;

import java.util.Scanner;
public class Level9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int sum = A + B;
		int min = A - B;
		int mul = A * B;
		int num = A / B;
		int reminder = A % B;
		System.out.println(sum);
		System.out.println(min);
		System.out.println(mul);
		System.out.println(num);
		System.out.println(reminder);
		scanner.close();
	}
}
