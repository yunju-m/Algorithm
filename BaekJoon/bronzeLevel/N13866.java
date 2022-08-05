package bronzeLevel;

import java.util.Arrays;
import java.util.Scanner;

// 팀 나누기
public class N13866 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		int max = arr[0]+arr[3];
		int min = arr[1]+arr[2];
		System.out.println(Math.abs(max-min));
		scn.close();
	}

}