package stage10;

import java.util.Scanner;
// 재귀함수로 별 찍기
public class Level3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		star(N);
		scn.close();
	}

	public static int star(int n) {
		
		return star(n/3);
	}
}
