import java.util.Scanner;

// 지능형 기차
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0, num1, num2;
		int max = 0;
		for (int i = 0; i < 4; i++) {
			num1 = scn.nextInt();
			num2 = scn.nextInt();
			sum += num2 - num1;
			max = Math.max(sum, max);
		}
		System.out.println(max);
		scn.close();
	}

}
