package bronzeLevel;

import java.util.ArrayList;
import java.util.Scanner;

// 과제 안내신분?
public class N5597 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 28; i++){
			arr.add(scn.nextInt());
		}
		boolean b;
		for (int i = 1; i <= 30; i++) {
			b = arr.contains(i);
			if (b == false) sb.append(i).append('\n');
		}
		System.out.println(sb);
		scn.close();
	}

}
