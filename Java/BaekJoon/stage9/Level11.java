package stage9;

import java.util.Scanner;
// 두 원의 교점의 개수를 구하는 문제 
public class Level11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i, T = scn.nextInt();
		int x1, y1, r1, x2, y2, r2;
		for (i = 0; i < T; i++) {
			x1 = scn.nextInt();
			y1 = scn.nextInt();
			r1 = scn.nextInt();
			x2 = scn.nextInt();
			y2 = scn.nextInt();
			r2 = scn.nextInt();
			double d = Math.sqrt(Math.pow(x2-x1, 2) +
					Math.pow(y2-y1, 2));
			int result=0;
			// 중점사이에 거리가 0이거나 두 반지름이 같은 경우 교점은 무수히 많다.
			if (d == 0 && r1 == r2) result = -1;
			// d > r1+r2이거나 d <|r1-r2|이면 교점은 없다.
			else if (d > r1+r2 || d < Math.abs(r1-r2)) result = 0;
			// d = r1+r2이면 외접에서 만나고 d = |r1-r2|이면 내접에서 만난다.
			else if (d == r1+r2 || d == Math.abs(r1-r2)) result = 1;
			else if (d < r1 + r2) result = 2;
			
			System.out.println(result);
		}
		scn.close();
	}
}
