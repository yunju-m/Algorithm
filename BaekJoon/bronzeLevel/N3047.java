package bronzeLevel;

import java.util.Arrays;
import java.util.Scanner;

// ABC
public class N3047 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		String s = scn.next();
		Arrays.sort(arr);
		int A = arr[0];
		int B = arr[1];
		int C = arr[2];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A') sb.append(A).append(" ");
			else if (c == 'B') sb.append(B).append(" ");
			else sb.append(C).append(" ");
		}
		System.out.println(sb);
		scn.close();
	}
}
