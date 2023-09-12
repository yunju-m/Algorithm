import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, student = 1000;
		T=sc.nextInt();
		int[] score;
        
		for(int test_case = 1; test_case <= T; test_case++)
		{		
            int count = sc.nextInt();
            score = new int[student+1];
            int max_index = 0, max = Integer.MIN_VALUE;
            for (int i = 0; i < student; i++) 
            { 
                int num = sc.nextInt();
                score[num]++;  
            }

            for (int i = student; i >= 0; i--) {
            	if (score[i] > max) {
                    max = score[i];
            		max_index = i;
                }
            }
			System.out.println("#"+count+ " " + max_index);
		}
		sc.close();
	}
}