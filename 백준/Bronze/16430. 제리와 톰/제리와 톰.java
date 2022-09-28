import java.util.Scanner;

// 제리와 톰
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		int P = B-A;
		int Q = B;
		System.out.println(P+" "+Q);
		scn.close();
	}

}
