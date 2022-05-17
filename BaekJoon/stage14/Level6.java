package stage14;

import java.util.Scanner;

// 링
public class Level6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] r = new int[N];
		int tmp = 0;
		for (int i = 0; i < N; i++) {
			r[i] = scn.nextInt();
		}
		int num, num2;
		for (int i = 1; i < N; i++) {
			num = r[0];
			num2 = r[i];
			while (true) {
				if (num2==0) break;
				else {
					tmp = num%num2;
					num = num2;
					num2 = tmp;
				}
			}
			System.out.println(r[0]/num+ "/" + r[i]/num);
		}
		scn.close();
	}

}
