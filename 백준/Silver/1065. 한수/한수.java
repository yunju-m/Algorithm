import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int total = han(n);
		System.out.println(total);
		scanner.close();
	}

	public static int han(int n) {
		int cnt = 99;	
		if(n <= 99)		
			return cnt = n;
		else {
			for (int i = 100; i <= n; i++) {
				int one = i % 10;
				int ten = i / 10 % 10;
				int bak = i / 100;
				if (bak - ten == ten - one)
					cnt++;
			}
		}
		return cnt;
	}
}