package stage7;

import java.util.Scanner;

public class Level7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		char[] c1 = new char[3];
		char[] c2 = new char[3];
		int result = 0, result2 = 0;
		int cnt = 100;
		
		for(int i = 0; i < s1.length(); i++) {
			c1[i] = s1.charAt(i);
			c2[i] = s2.charAt(i);
		}
		
		for (int i = s1.length()-1; i >= 0; i--) {
			result += (c1[i]-'0') * cnt;
			result2 += (c2[i]-'0') * cnt;
			cnt = cnt / 10;
		}
		
		if(result > result2)
			System.out.println(result);
		else
			System.out.println(result2);
		scn.close();
	}
}
