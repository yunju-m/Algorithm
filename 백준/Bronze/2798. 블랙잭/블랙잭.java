
import java.util.Scanner;
// 세 장의 카드를 고르는 모든 경우를 고려하는 문제
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), M = scn.nextInt();
		int [] arr = new int[N];
		int MAX = 0;
		for (int i = 0; i <N; i++) {
			arr[i] = scn.nextInt();
		}
		for (int j = 0; j <N; j++) {
			for (int k = j+1; k < N; k++) {
				for (int l = k+1; l < N; l++) {
					if (arr[j]+arr[k]+arr[l] <=	 M) {
						MAX = Math.max(MAX, arr[j]+arr[k]+arr[l]);
					}
				}
			}
		}
		System.out.println(MAX);
		scn.close();
	}

}
