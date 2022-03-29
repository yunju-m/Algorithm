package stage3;

import java.util.Scanner;
public class Level3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, sum = 0;
		num = input.nextInt();
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		input.close();
	}
}
