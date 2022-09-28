import java.util.Scanner;

// 지능형 기차2
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, sum = 0, max = 0;
		for (int i = 0; i < 10; i++) {
			num1 = scn.nextInt();	// 내린사람
			num2 = scn.nextInt();	// 탄사람
			sum += num2 - num1;
			max = Math.max(sum, max);
		}
		System.out.println(max);
		scn.close();
	}

}
