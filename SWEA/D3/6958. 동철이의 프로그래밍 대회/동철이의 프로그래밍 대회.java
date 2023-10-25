import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, N, M;
		int winer, problem, score, Maxscore = 0;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt();
            M = sc.nextInt();
            int[] totalScore = new int[N];
            Maxscore = 0;
            
            for (int i = 0; i < N; i++) {
            	score = 0;
                for (int j = 0; j < M; j++) {
                    score += sc.nextInt();
                    totalScore[i] = score;
                }
                if (score > Maxscore) {
                	Maxscore = score;
                }
            }
            
            winer = 0;
            for (int s : totalScore) {
            	if (s == Maxscore) {
            		winer++;
            	}
            }
            System.out.println("#" + test_case + " " + winer + " " + Maxscore);
		}
		sc.close();
	}
}