import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double uMath, tMath;
		int r = scn.nextInt();
		uMath = Math.PI*r*r;
		tMath = 2*r*r;
		System.out.println(String.format("%.6f", uMath));
		System.out.println(String.format("%.6f", tMath));
		scn.close();
	}
}
