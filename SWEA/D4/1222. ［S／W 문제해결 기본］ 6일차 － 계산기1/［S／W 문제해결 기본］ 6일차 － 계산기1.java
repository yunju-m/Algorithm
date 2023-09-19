import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int str_len = sc.nextInt();
			String str = sc.next();
			String[] cal = str.split("\\+");

			int result = 0;
			for (String c : cal){
				result += Integer.parseInt(c);
			}
			System.out.println("#" + test_case + " " + result);
		}
		sc.close();
	}
}