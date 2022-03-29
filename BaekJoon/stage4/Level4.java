package stage4;

import java.util.HashSet;
import java.util.Scanner;

public class Level4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < 10; i++)
			set.add(scanner.nextInt() % 42);
		System.out.println(set.size());
		scanner.close();
	}
}
