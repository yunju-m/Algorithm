package stage4;

import java.util.Scanner;

public class Level7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for(int i = 0; i < num; i++) {
			int stuN = scanner.nextInt();
			int[] score = new int[stuN];
			int cnt = 0;
			double avg = 0.0;

			for(int j = 0; j < stuN; j++) {
				score[j] = scanner.nextInt();
				avg += score[j];
			}
			avg = avg / stuN;
			for(int k = 0; k < stuN; k++) {
				if(score[k] > avg)
					cnt++;
			}
			System.out.printf("%.3f",(double)cnt/(double)stuN*100);
			System.out.println("%");
		}
		scanner.close();
	}
}
