import java.util.Scanner;

// 영수증
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
		int N = scn.nextInt();
		int a, b;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			a = scn.nextInt();
			b = scn.nextInt();
			sum += a * b;
		}
		if (X == sum) System.out.println("Yes");
		else System.out.println("No");
		scn.close();
	}

}
