package stage5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Level6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] cnt = new int[num];
		int mul = 1;

		List<String> arr = new ArrayList<>();
		for(int i = 0; i < num; i++) {
			arr.add(scanner.next());
		}
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < arr.get(i).length(); j++) {
				if(arr.get(i).charAt(j) == 'O') {
					cnt[i] += mul;
					mul++;
				}
				else
					mul = 1;
			}
			System.out.println(cnt[i]);
			mul = 1;
		}
		scanner.close();
	}
}
