package bronzeLevel;

import java.util.Scanner;

// 대소문자 바꾸기
public class N2744 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = scn.next();
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if ((c >= 65) && (c <= 90)) {
				sb.append((char)(c+32));
			} else if ((c >= 97) && (c <= 122)) {
				sb.append((char)(c-32));
			}
		}
		System.out.println(sb);
		scn.close();
	}

}
