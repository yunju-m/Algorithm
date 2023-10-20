import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, N;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt();
            System.out.print("#" + test_case  + " ");
            for (int i = 1; i <= N; i++) {
                System.out.print("1/" + N + " ");
            }
            System.out.println();
		}
	}
}