import java.util.Scanner;

// 가희와 방어율 무시
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		double n = a*b*0.01;
		a = (int)(a-n);
		if (a>=100) System.out.println(0);
		else System.out.println(1);
		scn.close();
	}

}
