package stage13;

import java.util.Scanner;
// 약수
public class Level2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = scn.nextInt();
		int min = arr[0], max = arr[0];
		if(N==1) System.out.println(arr[0]*arr[0]);
		else {
			for (int i = 1; i < N; i++) {
				min = Math.min(min, arr[i]);
				max = Math.max(max, arr[i]);
			}
			System.out.println(min*max);
		}
		scn.close();
	}
}