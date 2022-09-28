import java.util.HashMap;
import java.util.Scanner;

// Hashing
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<Integer, Character> map = new HashMap<>();
		int L = scn.nextInt();
		String s = scn.next();
		int count = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			map.put(count, i);
			count++;
		}
		long sum = 0;
		count = 0;
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < map.size(); j++) {
				if(s.charAt(i) == map.get(j)) {
					sum += ((j+1) * pow(count));
					count++;
				}
			}
		}
		System.out.println(sum);
		scn.close();
	}
	public static long pow(int n) {
		long sum = 1;
		for (int i = 0; i < n; i++) {
			sum *= 31;
		}
		return sum;
	}
}
