import java.util.Scanner;
import java.util.Arrays;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, N, M;
        T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt();
            M = sc.nextInt();
            int[] snack = new int[N];
            for (int i = 0; i < N; i++){
                snack[i] = sc.nextInt();
            }
            int sum = 0, max = 0;
            for (int i = 0; i < N-1; i++){
            	for (int j = i+1; j < N; j++) {
            		sum = snack[i] + snack[j];
                    if (sum <= M && sum > max) {
                        max = sum;
                    }
            	}
            }
            if (max == 0) System.out.println("#" + test_case + " " + -1);
            else System.out.println("#" + test_case + " " + max);
		}
		sc.close();
	}
}