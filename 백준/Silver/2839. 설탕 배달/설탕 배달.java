import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int bag = 0, N = scn.nextInt();	// 봉지의 최소 갯수, 설탕 N킬로그램
		int cnt = N / 5;
			
		while ((N - 5 *cnt) % 3 != 0) {
			cnt--;
			if (cnt < 0) {
				cnt = 0;
				break;
			}
		}
		int rem = (N-5*cnt) / 3;
		bag = cnt + (N-5*cnt) / 3;

		if ((5*cnt + 3*rem) != N)
			bag = -1;
		
		System.out.println(bag);
		scn.close();
	}

}