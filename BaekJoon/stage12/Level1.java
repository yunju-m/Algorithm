package stage12;

import java.util.Scanner;
// 배수와 약수
public class Level1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			int first = scn.nextInt();
			int second = scn.nextInt();
			if(first == 0 && second == 0) break;
			if(second % first == 0) {
				System.out.println("factor");
			}
			else if(first % second == 0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
		scn.close();
	}
}
