package bronzeLevel;

import java.util.Scanner;

// 10진수를 16진수 표현하기
public class N1550 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(Integer.parseInt(s, 16));
		scn.close();
	}

}
