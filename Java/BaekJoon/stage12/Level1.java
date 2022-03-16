package stage12;

import java.util.Scanner;

// 시간 복잡도가 O(n^2)인 정렬 알고리즘으로 푼다. 
// ex, 삽입 정렬, 거품 정렬
public class Level1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
		
		scn.close();
	}

}
