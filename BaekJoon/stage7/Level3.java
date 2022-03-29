package stage7;

import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();	// 순서를 구할 분수
		int total = 1;
		int cnt = 1;
		int mo = 1;
		int za = 1;
		while(true) {
			total += cnt;
			if (total > num) {
				break;
			}
			else
				cnt++;
		}

		za = cnt;
		for (int i = total-cnt; i < num; i++) {
			za--;
			mo++;
		}
		if (cnt % 2 == 0)
			System.out.println(mo + "/" + za);
		else
			System.out.println(za + "/" + mo);
		scn.close();
	}

}
