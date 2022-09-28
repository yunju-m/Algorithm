import java.util.Scanner;
// 5의 수난
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = num%10;
			num = num/10;
			sum += Math.pow(n, 5);
		}
		System.out.println(sum);
		scn.close();
	}

}
