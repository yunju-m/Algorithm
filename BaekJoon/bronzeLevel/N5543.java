package bronzeLevel;

import java.util.Scanner;

// 상근날드
public class N5543 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int cola = scn.nextInt();
		int sada = scn.nextInt();
		a = Math.min(a+cola, a+sada);
		b = Math.min(b+cola, b+sada);
		c = Math.min(c+cola, c+sada);
		System.out.println(Math.min(c, Math.min(a, b))-50);
		scn.close();
	}

}
