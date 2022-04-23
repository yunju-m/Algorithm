package bronzeLevel;

import java.util.Scanner;

// 심부름 가는 길
public class N5554 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += scn.nextInt();
		}
		System.out.println(sum/60);
		System.out.println(sum%60);
		scn.close();
	}

}
