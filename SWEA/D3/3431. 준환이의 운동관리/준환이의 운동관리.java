import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, L, U, X, exertime = 0;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            L = sc.nextInt();
            U = sc.nextInt();
            X = sc.nextInt();
            
            if (X < L) {
                exertime = L - X;
            } else if (X >= L) {
                if (X > U) {
                    exertime = -1;
                } else {
                    exertime = 0;
                }
            }
            System.out.println("#" + test_case + " " + exertime);
		}
	}
}