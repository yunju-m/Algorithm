import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, n, sum = 0;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                sum = 0;
                for (int j = i; j <= n; j++) {
                    sum += j;
                    if (sum == n) {
                        result++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println("#" + test_case + " " + result);
		}
	}
}