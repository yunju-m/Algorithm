import java.util.Scanner;

// 구간 합 구하기 4
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = scn.nextInt(), M = scn.nextInt();
		int[] arr = new int[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = scn.nextInt();
		}
		// 누적합구하기
		int[] prefix_sum = new int[N+1];
		for (int j = 1; j < arr.length; j++) {
			prefix_sum[j] += prefix_sum[j-1]+arr[j];
		}

		int first, last;
		for (int i = 0; i < M; i++) {
			first = scn.nextInt();
			last = scn.nextInt();
			sb.append(prefix_sum[last] - prefix_sum[first-1]).append('\n');
		}
		System.out.println(sb);
		scn.close();
	}

}
