package bronzeLevel;

import java.util.Scanner;

// 조별과제를 하려는데 조장이 사라졌다.
public class N15727 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int L = scn.nextInt();
		int cnt = 0;
		while(L>0) {
			L = L-5;
			cnt++;
		}
		System.out.println(cnt);
		scn.close();
	}

}
