import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, S, E, M, std;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            S = sc.nextInt() - 1;
            E = sc.nextInt() - 1;
            M = sc.nextInt() - 1;
            std = E;
            while(true){
                if (std % 365 == S && std % 29 == M) {
                    System.out.println("#" + test_case + " " + (std+1));
                    break;
                }
                std += 24;
            }
		}
	}
}