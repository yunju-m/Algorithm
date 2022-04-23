package bronzeLevel;

import java.util.ArrayList;
import java.util.Scanner;

// 킹, 퀸, 룩, 비숍, 나이트, 폰
public class N3003 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1); arr.add(1);
		arr.add(2); arr.add(2);
		arr.add(2); arr.add(8);
		for (int i = 0; i < 6; i++) {
			int n = scn.nextInt();
			System.out.print(arr.get(i)-n + " ");
		}
		scn.close();
	}
}
