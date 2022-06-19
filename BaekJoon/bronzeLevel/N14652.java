package bronzeLevel;

import java.util.Scanner;
//나는 행복합니다~
public class N14652 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int k = scn.nextInt();
		int cnt=0;
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<m; j++) {
				if (cnt == k) System.out.println(i +" " +j);
				cnt++;
			}
		}
		scn.close();
	}

}
