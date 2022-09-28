import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		for (int i = 2; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
				N = N / i;
				i--;
			}
		}
		scn.close();
	}
}