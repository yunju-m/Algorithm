import java.util.Scanner;
// 음계
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] n = new int[8];
		for (int i = 0; i < 8; i++) {
			n[i] = scn.nextInt();
		}
		int up = 1;
		int down = 8;
		for (int i = 0; i < 8; i++) {
			if (n[i] == up) up++;
			else if (n[i] == down) down--;
		}
		if (up == 9) System.out.println("ascending");
		else if (down == 1) System.out.println("descending");
		else System.out.println("mixed");
		scn.close();
	}	

}
