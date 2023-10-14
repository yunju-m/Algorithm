import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] mo = {"a", "e", "i", "o", "u"};
		String alpha, result, target;
		
		for (int test_case = 1; test_case <= T; test_case++)
		{
			result = "";
			alpha = sc.next();
			for (int i = 0; i < alpha.length(); i++) {
				target = String.valueOf(alpha.charAt(i));
				
				if (!Arrays.asList(mo).contains(target)) {
					result += target;
				}	
			}
			System.out.println("#" + test_case + " " + result);
		}
		sc.close();
	}

}
