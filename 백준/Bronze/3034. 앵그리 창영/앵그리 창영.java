import java.util.Scanner;

//앵그리 창영
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = scn.nextInt();
		int W = scn.nextInt();
		int H = scn.nextInt();
		double WH = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
		int Nlength;
		for (int i = 0; i < N; i++) {
			Nlength = scn.nextInt();
			if (Nlength <= WH)
				sb.append("DA").append('\n');
			else sb.append("NE").append('\n');
		}
		System.out.println(sb);
		scn.close();
	}

}
