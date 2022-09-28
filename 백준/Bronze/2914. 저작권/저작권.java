import java.util.Scanner;

// 저작권
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int l = scn.nextInt();
		if (A == 1) System.out.println(A*l);
		else System.out.println(A*(l-1)+1);
		scn.close();
	}

}
