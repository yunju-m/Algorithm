package stage12;

import java.util.HashSet;
import java.util.Scanner;

// 서로 다른 부분 문자열
public class Level7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashSet<String> set = new HashSet<>();
		String s = scn.next();

		String result="";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				result += s.substring(j, j+1);
				set.add(result);
			}
			result = "";
		}
		System.out.println(set.size());
		scn.close();
	}
}
