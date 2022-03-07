package stage9;

import java.util.Scanner;
// 유클리드 기하학과 택시 기하학에 대한 문제
public class Level10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double uMath, tMath;
		int r = scn.nextInt();
		uMath = Math.PI*r*r;
		tMath = 2*r*r;
		System.out.println(String.format("%.6f", uMath));
		System.out.println(String.format("%.6f", tMath));
		scn.close();
	}
}
