import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] num = new int[size];
		int max = 0, min = 0;
		for (int i = 0 ; i < size; i++) {
			num[i] = scanner.nextInt();
		}
		min = num[0];
		max = num[0];
		for (int i = 0 ; i < size; i++) {
			if (min > num[i])
				min = num[i];
			if (max < num[i])
				max = num[i];
		}
		System.out.println(min + " " + max);
		scanner.close();
	}
}