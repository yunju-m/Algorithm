import java.util.Arrays;
import java.util.Scanner;

// 수 찾기
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		int M = scn.nextInt();
		int b, result;
		for (int i = 0; i < M; i++) {
			b = scn.nextInt();
			result = binarySearch(arr, b);
			System.out.println(result);
		}		
		scn.close();
	}

	public static int binarySearch(int[] arr, int b) {
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)/2;

		while (end-start>=0) {
			if (arr[mid] == b) return 1;
			else if (arr[mid] <= b) start = mid+1;
			else end = mid-1;
			mid = (end+start)/2;
		}
		return 0;
	}
}
