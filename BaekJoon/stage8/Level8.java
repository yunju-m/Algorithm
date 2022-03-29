package stage8;

import java.util.Scanner;
// 직사각형을 완성하는 문제 
public class Level8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x1, y1, x2, y2, x3, y3, x4, y4; 
		x1 = scn.nextInt();
		y1 = scn.nextInt();
		x2 = scn.nextInt();
		y2 = scn.nextInt();
		x3 = scn.nextInt();
		y3 = scn.nextInt();
		
		// 삼항연산자 사용
		x4 = x1==x2 ? x3 : (x1==x3 ? x2 : x1);
		y4 = y1==y2 ? y3 : (y1==y3 ? y2 : y1);
		System.out.println(x4 + " " + y4);
		scn.close();
	}

}
