import java.util.Scanner;

// 뒤집힌 덧셈
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String X = scn.next();
		String Y = scn.next();
		String x = "", y = "";
		for (int i = X.length()-1; i >= 0; i--) {
			x += X.charAt(i);
		}
		for (int i = Y.length()-1; i >= 0; i--) {
			y += Y.charAt(i);
		}
		int sum = Integer.parseInt(x) + Integer.parseInt(y);
		String s = Integer.toString(sum);
		String result = "";
		int cnt = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i) == '0'){
				cnt++;
            } else break;
		}
		for (int i = s.length()-1-cnt; i >= 0; i--) {
			result += s.charAt(i);
		}
		System.out.println(result);
		scn.close();
	}

}
