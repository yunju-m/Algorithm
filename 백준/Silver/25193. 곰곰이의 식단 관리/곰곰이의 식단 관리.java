import java.util.Scanner;

// 곰곰이의 식단 관리
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int cnt = 0;
		String s = scn.next();
		char c;
		for (int i = 0; i < N; i++) {
			c = s.charAt(i);
			if (c == 'C') {
				cnt+=1;
			}
		} 
		System.out.println(cnt/(N-cnt+1)+(cnt%(N-cnt+1)!=0?1:0));

		scn.close();
	}

}
