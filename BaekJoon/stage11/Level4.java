package stage11;

import java.util.Arrays;
import java.util.Scanner;

// 정렬을 활용하는 문제, 통계학
// 산술평균, 중앙값, 최빈값, 범위(최댓값-최솟값)구하기
public class Level4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr  = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}

		Arrays.sort(arr);		
		for (int i = 0; i < N; i++) {
			sum += arr[i];
		}

		boolean flag = false;
		int max = 0;
		int mode = 10000;

		for (int i = 0; i < N; i++) {
			int jump = 0;
			int count = 1;
			int i_value = arr[i];

			for (int j = i+1; j < N; j++) {
				if (i_value != arr[j]) {
					break;
				}
				count++;
				jump++;
			}

			if (count > max) {
				max = count;
				mode = i_value;
				flag = true;
			}
			else if (count == max && flag == true) {
				mode = i_value;
				flag = false;
			}
			i+= jump;
		}

		System.out.println((int)Math.round((double)sum/N));				
		System.out.println(arr[N/2]);
		System.out.println(mode);
		System.out.println(arr[N-1]-arr[0]);
		scn.close();
	}

}
