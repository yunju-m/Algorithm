import java.util.Scanner;

// 쉽게 푸는 문제
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int start = scn.nextInt();
		int end = scn.nextInt();
		int[] arr = new int[1001];
		int cnt = 1;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 0; j < i; j++) {
				if (cnt == 1001) break;
				arr[cnt] = i;
				cnt++;
			}
		}
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		scn.close();
	}
}
