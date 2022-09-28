import java.util.Scanner;

// 검증수
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += (int) Math.pow(scn.nextInt(), 2);
		}
		System.out.println(sum%10);
		scn.close();
	}

}
