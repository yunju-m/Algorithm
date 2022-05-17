package stage14;

import java.util.Arrays;
import java.util.Scanner;

// 검문
public class Level5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		int a = arr[1], b = arr[0];
		a = a-b;
		for (int i = 2; i < N; i++) {
			a = uclid(a, arr[i]-arr[i-1]);
		}

		for (int i = 2; i <= a; i++) {
			if (a%i==0) System.out.print(i+" ");
		}
		scn.close();
	}

	public static int uclid(int a, int b) {
		int tmp;
		while (true) {
			if (b == 0) break;
			else {
				tmp = a%b;
				a = b;
				b = tmp;
			}
		}
		return a;
	}
}
