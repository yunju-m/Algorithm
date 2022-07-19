package bronzeLevel;

import java.util.Scanner;

// 집 주소
public class N1284 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char c; int sum = 0;
		while (true) {
			String s  = scn.nextLine();
			if (s.equals("0")) break;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if (c == '0') sum += 4;
				else if (c == '1') sum += 2;
				else sum += 3;
			}
			System.out.println(sum+s.length()+1);
			sum = 0;
		}
		scn.close();
	}

}
