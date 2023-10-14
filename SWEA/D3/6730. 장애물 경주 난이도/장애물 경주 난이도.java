import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, N, h, up, down;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt();
            int[] block = new int[N];
            up = 0;
            down = 0;
            for (int i = 0; i < N; i++){
                block[i] = sc.nextInt();
            }
            for (int i = 1; i < N; i++){
                h = block[i-1] - block[i];
                if (h < up) up = h;
                if (h > down) down = h;
            }
            System.out.println("#" + test_case + " " + Math.abs(up) + " " + down);
		}
	}
}