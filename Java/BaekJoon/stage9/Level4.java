package stage9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 에스토스테네스체 사용
public class Level4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int M = scn.nextInt(), N = scn.nextInt();
		getPrime(M, N);
		
		scn.close();
	}
	
	public static void getPrime(int m, int n) {
		List<Integer> prime = new ArrayList<Integer>();
		int[] primeChk = new int[n+1];
		primeChk[0] = primeChk[1] = 1;
		
		for (int i = 2; i <=n; i++) {
			if (primeChk[i] != 1)
				prime.add(i);
			for (int j = (i+i); j <=n; j+=i) {
				if (primeChk[j] != 1)
					primeChk[j] = 1;
			}
		}
		for (int i = 0; i < prime.size(); i++)
			System.out.println(prime.get(i));
	}
}