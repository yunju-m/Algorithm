import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();	// 치킨집의 치킨개수
		int A = scn.nextInt();	// 콜라 개수
		int B = scn.nextInt();	// 맥주 개수
		int cnt = 0;			// 치킨 먹는 개수
		cnt = A/2;
		cnt+= B;
		if (N >= cnt) System.out.println(cnt);
		else System.out.println(N);
		scn.close();
	}

}
