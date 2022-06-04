package stage13;

import java.util.Scanner;

// 어린왕자
public class Level7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = scn.nextInt();
		int x1, y1, x2, y2, cx, cy, r;
		int n, count = 0; 		// 행성계 개수
		boolean f1, f2;
		for (int i = 0; i < T; i++) {
			x1 = scn.nextInt(); y1 = scn.nextInt();
			x2 = scn.nextInt(); y2 = scn.nextInt();
			n = scn.nextInt();
			for (int j = 0; j < n; j++) {
				f1= false; f2 = false;
				cx = scn.nextInt();
				cy = scn.nextInt();
				r = scn.nextInt();
				if ((x1-cx)*(x1-cx) + (y1-cy)*(y1-cy) < r*r) {		// 출발지가 내포된 경우
					f1 = true;
				} if ((x2-cx)*(x2-cx) + (y2-cy)*(y2-cy) < r*r) {
					f2 = true;
				}
				if ((f1 && !f2) || (!f1 && f2)) {
					count++;
				}
			}
			sb.append(count).append('\n');
			count = 0;
		}
		System.out.println(sb);
		scn.close();
	}

}
