import java.util.Scanner;
public class Main {
	static public int T;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		int A, B;
		for (int i = 0; i < T; i++) {
		A = scanner.nextInt();
		B = scanner.nextInt();
		System.out.println(A+B);
		}
		scanner.close();
	}
}