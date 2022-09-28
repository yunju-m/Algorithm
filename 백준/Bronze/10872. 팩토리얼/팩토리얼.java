import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int result = factorial(n);
		System.out.print(result);
		scn.close();
	}
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
}
