package stage13;

import java.util.Scanner;

// 하키
public class Level8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int W, H, X, Y, P;
		W = scn.nextInt(); H = scn.nextInt();
		X = scn.nextInt(); Y = scn.nextInt();
		P = scn.nextInt();	// 선수의 수
		int x, y, cnt = 0;
		for (int i = 0; i < P; i++) {
			x = scn.nextInt();
			y = scn.nextInt();
			// 1. 사각형 안에 있는 좌표
			if ((X <= x && x <= X+W) && (Y <= y && y <= Y+H)) {
				cnt++;
			} else if (Math.pow(X-x, 2) + Math.pow(Y+H/2-y, 2) <= Math.pow(H/2, 2)) {
				cnt++;
			} else if (Math.pow(X+W-x, 2) + Math.pow(Y+H/2-y, 2) <= Math.pow(H/2, 2)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		scn.close();
	}

}
