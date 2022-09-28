import java.util.Scanner;
//R2
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int R1 = scn.nextInt();
		int S = scn.nextInt();
		int R2 = (S*2)-R1;
		System.out.println(R2);
		scn.close();
	}

}
