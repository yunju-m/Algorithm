import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			double r = 0;
			ArrayList <Integer> a = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				a.add(tmp);
			}
			
			Collections.sort(a);
			
			for(int i = a.size() - k; i < a.size(); i++) {
				r = (r + a.get(i)) / 2;
			}
			System.out.printf("#%d %.6f\n", t, r);
		}
	}
}