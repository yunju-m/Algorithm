import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, a, b, c, d = 0;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a == b) d = c;
            else if (b == c) d = a;
            else if (c == a) d = b;
            System.out.println("#" + test_case + " " + d);
		}
	}
}