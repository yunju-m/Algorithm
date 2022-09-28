import java.util.Scanner;

// 나무 자르기
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long M = scn.nextLong();
		long[] arr = new long[N];
		long max = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextLong();
			if (max < arr[i])
				max = arr[i];
		}
		max++;
		long result = BinarySearch(arr, 0, max, M);
		System.out.println(result);
		scn.close();
	}

	public static long BinarySearch(long[] arr, long min, long max, long m ) {
		long mid;
		while (min < max) {
			mid = (min+max)/2;
			long count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > mid)
					count += (arr[i]-mid); 
			}
			if (count < m) {
				max = mid;
			} else {
				min = mid + 1; 
			}
		}
		return min - 1;
	}

}
