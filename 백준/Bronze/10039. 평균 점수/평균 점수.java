import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int n;
		for (int i = 0; i < 5; i++) {
			n = scn.nextInt();
			if (n < 40) {
				sum += 40;
			} else sum += n;
		}
		System.out.println(sum/5);
		scn.close();
	}

}
