import java.util.Scanner;

// 개수세기
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		int v = scn.nextInt();
		for (int i= 0; i < N; i++) {
			if (arr[i] == v)
				cnt++;
		}
		System.out.println(cnt);
		scn.close();
	}

}
