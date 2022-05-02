package stage9;

import java.util.Scanner;
// 하노이탑 이동 순서
public class Level5 {
	static StringBuilder sb = new StringBuilder();
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int K = scn.nextInt();
		int start=1, to=3, via=2;
		hanoi(K, start, to, via);
		System.out.println(cnt);
		System.out.println(sb);
		scn.close();
	}
	public static void hanoi(int n, int start, int to, int via) {
		if (n==1) {
			move(n, start, to);
		}
		else {
			hanoi(n-1, start, via, to);
			move(n, start, to);
			hanoi(n-1, via, to, start);
		}
	}
	public static void move(int n, int start, int to) {
		sb.append(start + " " + to +"\n");
		cnt++;
	}
}
