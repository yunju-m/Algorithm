import java.util.Scanner;

// 원재의 메모리 복구하기
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String memory;
		char before;
		int ans;
		for (int t = 1; t <= T; t++) {
			memory = sc.next();
			before = '0';
			ans = 0;
			for (int i = 0; i < memory.length(); i++) {
				if (before != memory.charAt(i)) {
					before = memory.charAt(i);
					ans++;
				}
			}
			System.out.printf("#%d %d\n", t, ans);
		}
	}
}