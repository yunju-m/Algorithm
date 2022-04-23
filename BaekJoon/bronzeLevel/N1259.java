package bronzeLevel;

import java.util.Scanner;

// 펠린드롬수
public class N1259 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String result = "";
		while (true) {
			String s = scn.next();
			if (s.equals("0")) break;
			else {
				int middle = s.length()/2;
				for (int i = 0; i <= middle; i++) {
					if (s.charAt(i) != s.charAt(s.length()-1-i)) {
						result = "no";
						break;
					} else {
						result = "yes";
					}
				}
			}
			System.out.println(result);
		}
		scn.close();
	}

}
