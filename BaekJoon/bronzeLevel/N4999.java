package bronzeLevel;

import java.util.Scanner;

// 아!
public class N4999 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		String d = scn.nextLine();
		if (s.length() >= d.length())
			System.out.println("go");
		else System.out.println("no");
		scn.close();
	}

}
