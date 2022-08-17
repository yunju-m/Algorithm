package stage17;

import java.util.Scanner;

// 수열
public class Level2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), K = scn.nextInt();
		int[] arr = new int[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = scn.nextInt();
		}
		// 누적합
		int[] sum = new int[N+1];
		for (int i = 1; i < arr.length; i++) {
			sum[i] += sum[i-1]+arr[i];
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= N-K; i++) {
			max = Math.max(max, sum[K+i]-sum[i]);
		}
		System.out.println(max);
		scn.close();
	}

}
