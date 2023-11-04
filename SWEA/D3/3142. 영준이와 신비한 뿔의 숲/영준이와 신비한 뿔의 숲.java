import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, n, m;
		T=sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
        	n = sc.nextInt();
        	m = sc.nextInt();
        	System.out.println("#" + tc + " " + (m-(n-m)) + " " + (n-m));
        }
        
        sc.close();
	}
}