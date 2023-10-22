import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n+m+1];
			
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= m; j++) {
					a[i+j]++;
				}
			}
			int max = 0;
			for(int i = 2; i <= m+n; i++) {
				max = Math.max(a[i], max);
			}
			System.out.print("#" + t + " ");
			for(int i = 2; i <= m+n; i++) {
				if(a[i] == max)
					System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}