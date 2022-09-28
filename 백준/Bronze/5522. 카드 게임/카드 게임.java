import java.util.Scanner;

// 카드게임
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum=0;
		for (int i = 0; i < 5; i++) {
			sum+= scn.nextInt();
		}
		System.out.println(sum);
		scn.close();
	}

}
