import java.util.Scanner;

// 신나는 함수 실행
public class Main {
	static int dp[][][] = new int[21][21][21];
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b, c;
		while (true) {
			a = scn.nextInt();
			b = scn.nextInt();
			c = scn.nextInt();
			if (a == -1 && b == -1 && c== -1) break;
			else {
				System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
			}
		}
		scn.close();
	}

	public static int w(int a, int b, int c) {
		// a, b, c가 범위를 벗어나지 않으면서 메모리제이션이 되어있는 경우
		if (inRange(a, b, c) && dp[a][b][c] != 0) 
			return dp[a][b][c];
		if (a <= 0 || b <= 0 || c <= 0)
			return 1;
		/**
		 * a, b, c 중 하나라도 20이 넘어가면 w(20, 20, 20)을 호출하기 때문에
		 * dp[20][20][20]에 저장하고 반환한다.
		 */
		if (a > 20 || b > 20 || c > 20) 
			return dp[20][20][20] = w(20, 20, 20);
		if (a < b && b < c)
			return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		else 
			return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}

	/**
	 * 배열을 참조할 때 a, b, c 중 하나라도 범위 밖의 수가 
	 * 나올 수 있기 때문에 이를 체크해 주기 위한 함수.
	 */
	static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}

}
