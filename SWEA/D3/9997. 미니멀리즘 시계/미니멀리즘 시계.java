import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, angle, h, m;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            angle = sc.nextInt();
            h = angle/30;
            m = angle%30 * 2;
            System.out.println("#" + test_case + " " + h + " " + m);
		}
	}
}