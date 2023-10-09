import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            long N = sc.nextLong();
            long path = N-1;
            for (long num = 2 ; num <= Math.sqrt(N); num++) {
            	if (N % num == 0) {
            		if (path > (num + (N/num) - 2)) {
            			path = num + (N/num) - 2;
            		}
            	}
            }
            System.out.println("#" + test_case + " " + path);
		}
		sc.close();
	}
}