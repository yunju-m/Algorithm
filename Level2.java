package stage12;

import java.util.Scanner;

// 시간 복잡도가 O(nlogn)인 정렬 알고리즘
// 병합정렬, 힙정렬등 사용
public class Level2 {
	private static int[] sorted;
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int [N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		merge_sort(arr);
		for (int i = 0; i < N; i++)
		System.out.println(sorted[i]);
		scn.close();
	}
	
	public static void merge_sort(int[] a) {
		sorted = new int [a.length];
		merge_sort(a, 0, a.length-1);
		
	}
	
	// Top-Down 방식 구현
	private static void merge_sort(int[] a, int left, int right) {
		if (left == right) return;
		int mid = (left + right) / 2;
		
		merge_sort(a, left, mid);
		merge_sort(a, mid+1, right);
		
		merge(a, left, mid, right);	// 병합 작업
	}
	
	/**
	 * 합칠 부분리스트는 a배열의 left~right까지이다.
	 * @param a 정렬할 배열
	 * @param left 배열의 시작점
	 * @param mid 배열의 중간점 
	 * @param right 배열의 끝 점
	 */
	private static void merge(int[] a, int left, int mid, int right) {
		int l = left;		// 왼쪽 부분리스트 시작점
		int r = mid + 1;	// 오른쪽 부분리스트 시작점
		int idx = left;		// 배열의 index
		System.out.println("l: " + l + " r: " + r + " idx: " + idx);
		while (l <= mid && r <= right) {
			/*
			 * 왼쪽 부분리스트 l번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우
			 * 왼쪽의 l번째 원소를 새 배열에 넣고 l과 idx를 1 증가시킨다.
			 */
			if (a[l] <= a[r]) {
				sorted[idx] = a[l];
				idx++;
				l++;
			}
			/*
			 * 오른쪽 부분리스트 r번째 원소가 왼쪽 부분리스트 l번째 원소보다 작거나 같을 경우
			 * 오른쪽의 r번째 원소를 새 배열에 넣고 r과 idx를 1 증가시킨다.
			 */
			else {
				sorted[idx] = a[r];
				idx++;
				r++;
			}
		}
		
		/*
		 * 왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (l > mid)
		 * = 오른쪽 부분리스트 원소가 아직 남아있을 경우
		 * 오른쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
		 */
		if (l > mid) {
			while (r <= right) {
				sorted[idx] = a[r];
				idx++;
				r++;
			}
		}
		/*
		 * 오른쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (r > right)
		 * = 왼쪽 부분리스트 원소가 아직 남아있을 경우
		 * 왼쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
		 */
		else {
			while (l <= mid) {
				sorted[idx] = a[l];
				idx++;
				l++;
			}
		}
		for (int i = 0; i < 5; i++)
			System.out.print(sorted[i]+ " ");
		System.out.println();
	}
}
