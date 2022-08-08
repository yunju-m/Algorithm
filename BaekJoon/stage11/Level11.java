package stage11;

import java.util.Arrays;
import java.util.Scanner;

// 커트라인
public class Level11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[N-k]);
		scn.close();
	}

}
