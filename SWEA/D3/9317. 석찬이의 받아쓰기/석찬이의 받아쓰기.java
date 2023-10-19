import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int TC, N, cnt;
        String[] sol, answer;
		TC=sc.nextInt();
		for(int test_case = 1; test_case <= TC; test_case++)
		{
            N = sc.nextInt();
            sol = sc.next().split("");
            answer = sc.next().split("");
            cnt = 0;
            for (int i = 0; i < N; i++){
                if (sol[i].equals(answer[i])){
                     cnt++;
                }
            }
            System.out.println("#" + test_case + " " + cnt);
		}
	}
}