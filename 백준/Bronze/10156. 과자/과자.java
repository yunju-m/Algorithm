import java.util.Scanner;

// 과자
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int K = scn.nextInt();
		int N = scn.nextInt();
		int M = scn.nextInt();
		if (M-K*N < 0) System.out.println(K*N-M);
		else System.out.println(0);
		scn.close();
	}

}
