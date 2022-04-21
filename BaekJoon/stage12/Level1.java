package stage12;

import java.util.Scanner;
// 배수와 약수
public class Level1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N, M;
		while (true) {
			N = scn.nextInt(); 
			M = scn.nextInt();
			if (N==0 && M==0) break;
			else {
				if (M%N==0) System.out.println("factor");
				else if(N%M==0) System.out.println("multiple");
				else System.out.println("neither");
			}
		}
		scn.close();
	}
}
