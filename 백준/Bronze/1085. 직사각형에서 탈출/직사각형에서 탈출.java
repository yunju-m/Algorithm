import java.util.Scanner;
// 직사각형에서 탈출
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x, y, w, h;
		x = scn.nextInt();
		y = scn.nextInt();
		w = scn.nextInt();
		h = scn.nextInt();
		int min = Math.min(Math.min(x, y), Math.min(w-x, h-y));
		System.out.println(min);
		scn.close();
	}
}