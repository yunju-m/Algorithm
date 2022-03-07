package stage2;

import java.util.Scanner;
public class Level7 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b, c;
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		if (a==b && a==c) System.out.println(10000+a*1000);
		else if (a==b || b==c) System.out.println(1000+b*100);
		else if (a==c) System.out.println(1000+c*100);
		else {
			int max = Math.max(a, b);
			max = Math.max(c, max);
			System.out.println(max*100);
		}
		scn.close();
	}
}
