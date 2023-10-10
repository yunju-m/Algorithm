import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
        int score, total;
		for(int test_case = 1; test_case <= T; test_case++)
        {
            total = 0;
            for (int i = 0; i < 5; i++) {
                score = sc.nextInt();
                if (score < 40) score = 40;
                total += score;
            }
            System.out.println("#" + test_case + " " + total/5);   
		}
	}
}