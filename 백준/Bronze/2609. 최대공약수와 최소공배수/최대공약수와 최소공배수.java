import java.util.Scanner;
// 최대공약수와 최소공배수
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int tmp;
		int num1 = N, num2 = M;
		// 최대 공약수 유클리드 호재법 이용
		while (num2!=0) {
			tmp = num1 % num2;
			num1 = num2;
			num2 = tmp;
		}
		num2 = num1 * (N/num1) * (M/num1);
		System.out.println(num1);
		System.out.println(num2);
		scn.close();
	}
}
