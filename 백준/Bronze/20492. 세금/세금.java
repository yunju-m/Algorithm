import java.util.Scanner;

// 세금
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		double m1 = n * 0.22;
		double m2 = (n - n*0.8) * 0.22;
		System.out.println((int)(n-m1)+" "+(int)(n-m2));
		scn.close();
	}

}
