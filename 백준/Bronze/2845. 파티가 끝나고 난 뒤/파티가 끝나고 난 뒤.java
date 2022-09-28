import java.util.Scanner;

// 파티가 끝나고 난 뒤
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int L = scn.nextInt();
		int P = scn.nextInt();
		int people = L*P;
		for (int i = 0; i < 5; i++) {
			int n = scn.nextInt();
			System.out.print(n - people + " ");
		}
		scn.close();
	}

}
