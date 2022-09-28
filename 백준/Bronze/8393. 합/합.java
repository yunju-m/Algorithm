import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, sum = 0;
		num = input.nextInt();
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		input.close();
	}
}