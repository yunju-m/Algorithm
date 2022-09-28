import java.util.Scanner;

// 방학 숙제
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int L = scn.nextInt();
		double A = scn.nextDouble();
		double B = scn.nextDouble();
		double C = scn.nextDouble();
		double D = scn.nextDouble();
		int homework = (int)Math.ceil(bigger(A/C, B/D));
		System.out.println(L-homework);
		scn.close();
	}
	public static double bigger(double a, double b) {
		if(a>b) 
			return a;
		else 
			return b;
	}

}
