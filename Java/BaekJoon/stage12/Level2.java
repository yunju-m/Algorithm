package stage12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 시간 복잡도가 O(nlogn)인 정렬 알고리즘
// 병합정렬, 힙정렬등 사용
public class Level2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			arr.add(scn.nextInt());
		}

		Collections.sort(arr);
		
		for (int value : arr) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
		scn.close();
	}
}