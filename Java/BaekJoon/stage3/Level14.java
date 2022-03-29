package stage3;

import java.util.Scanner;

public class Level14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int ten, one, sum, count, newnum;
		one = num % 10;
		ten = num / 10;
		count = newnum = 0;
		while(num != newnum) {
			sum = one + ten;
			ten = one;
			one = sum % 10;
			newnum = ten * 10 + one;
			count++;
		}
		if(num == 0)
			count = 1;
		System.out.println(count);
		scanner.close();
	}
}
