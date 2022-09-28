import java.util.Scanner;

// 그대로 출력하기
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(scn.hasNext()) {
			System.out.println(scn.nextLine());
		}
		scn.close();
	}

}
