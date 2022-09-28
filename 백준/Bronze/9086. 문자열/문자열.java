import java.util.Scanner;

// 문자열
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = scn.nextInt();
		String s;

		for (int i = 0; i < T; i++) {
			s = scn.next();
			sb.append(s.charAt(0)+""+s.charAt(s.length()-1)).append('\n');
		}
		System.out.println(sb);
		scn.close();
	}

}
