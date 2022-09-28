import java.util.Scanner;

// 랜선 자르기
public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int K = scn.nextInt(), N = scn.nextInt();
		int[] arr = new int[K];
		long max = 0;

		for (int i = 0; i < K; i++) {
			arr[i] = scn.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		max++;		// 탐색 범위  0~max+1
		long result = BinarySearch(arr, 0, max, N);
		System.out.println(result);
		scn.close();
	}
	public static long BinarySearch(int[] arr, long min, long max, int n) {
		long mid;
		while(min < max) {
			mid = (min+max)/2;
			long count = 0;
			for (int i = 0; i < arr.length; i++) {
				count += (arr[i]/mid);
			}

			if (count < n) {
				max = mid;
			} else {
				min = mid+1;
			}
		}
		return min-1;
	}
}