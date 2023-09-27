import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int N, L, maxScore;
    static int[][] material;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt();
            L = sc.nextInt();
            material = new int [N][2];
            for (int i = 0; i < N; i++) {
                material[i][0] = sc.nextInt();
                material[i][1] = sc.nextInt();
            }
            maxScore = 0;
            selectMaterial(0, 0, 0);
 
            System.out.println("#" + test_case + " " + maxScore);
		}
	}
    public static void selectMaterial(int idx, int scr, int cal) {
        if (cal > L) return;
        if (cal <= L) maxScore = Math.max(maxScore, scr);
        if (idx == N) return;
        
        selectMaterial(idx + 1, scr + material[idx][0], cal + material[idx][1]);
        selectMaterial(idx + 1, scr, cal);
    }
}