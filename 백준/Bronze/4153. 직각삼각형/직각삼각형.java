import java.util.Scanner;

// 직각삼각형
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x=1, y=1, z=1;
		while(true) {
			x = scn.nextInt();
			y = scn.nextInt();
			z = scn.nextInt();
			if (x==0 && y==0 && z==0) {
				break;
			}
			else {
				String result = (x*x + y*y == z*z) ? "right" : (x*x + z*z == y*y) ? "right" : 
					(y*y + z*z == x*x) ? "right" : "wrong";
				System.out.println(result);
			}
		}
		scn.close();
	}
}