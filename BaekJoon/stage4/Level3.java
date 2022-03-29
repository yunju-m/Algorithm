package stage4;

import java.util.Scanner;

public class Level3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A, B, C, value;
		int SIZE = 10;
		int cnt = 10;
		int index = 0;
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();

		value = A*B*C;
		int []num = new int[SIZE];
		while(value >= 1){
			num[index] = value%cnt;
			value = value/cnt;
			index++;
		}
		int[] count = new int[SIZE];
		for (int i = 0; i < index; i++) {
			for (int j = 0; j < SIZE; j++) {
				if(num[i] == j) {
					count[j]++;
					break;
				}
			}
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.println(count[i]);
		}
		scanner.close();
	}
}