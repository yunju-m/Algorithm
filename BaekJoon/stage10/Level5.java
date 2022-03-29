package stage10;

import java.util.Scanner;

// N번째 종말의 수가 나올 때까지 차례대로 시도하는 문제
public class Level5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int count = 0, cnt = 0;
		int s = 666;
		int num = 666;

		while (true) {
			s = num;
			while (s!=0) {
				if (s%10 == 6) {
					cnt++;
					s = s/10;
					if (cnt == 3) {
						count++;
						break;
					}
				} else {
					s = s/10;
					cnt = 0;
				}
			}
			if (N == count) {
				System.out.print(num);
				break;
			}
			else {
				num++;
				cnt = 0;
			}
		}
		scn.close();
	}

}
