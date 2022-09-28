import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, M;
		num = scanner.nextInt();
		int[] score = new int[num];
		double sum = 0.0;
		for(int i = 0; i < num; i++) {
			score[i] = scanner.nextInt();
			sum += score[i];
		}
		M = score[0];
		for (int i = 0; i < num; i++)
			if(M < score[i])
				M = score[i];
		double total = sum / M * 100 / num;
		
		System.out.println(total);
		scanner.close();
	}

}