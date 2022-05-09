package stage12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 숫자 카드
public class Level1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] narr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			narr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(narr);

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int result = binarySearch(narr, Integer.parseInt(st.nextToken()));
			if (result != -1) System.out.print(1+" ");
			else System.out.print(0+" ");
		}
	}

	// 이진탐색
	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		int mid = (end-start)/2;

		while (end-start>=0) {
			if (arr[mid] == target) {
				return mid;
			}
			else if (arr[mid] <= target) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			mid = (end+start)/2;
		}
		return -1;
	}

}
