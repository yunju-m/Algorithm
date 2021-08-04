package stage8;

import java.util.Scanner;

public class Level5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for (int i = 0; i < T; i++) {
			int H = scn.nextInt();	// 호텔의 층 수
			int W = scn.nextInt();	// 각 층의 방 수
			int N = scn.nextInt();	// 몇 번째 손님
			int Y;	// 해당 방 번호의 층 수
			int X;	// 해당 방 번호의 호 수 
			String room = "";

			if (H == 1) {
				Y = 1;
				X = N;
			}
			else {
				if (N > H) {
					Y = N % H;
					if (Y == 0) {
						Y = H;
						X = N / H;
					}
					else 
						X = N / H + 1;
				}
				else {
					Y = N;
					X = 1;
				}
			}

			if (X < 10)
				room = Y + "0" + X;
			else
				room = Y + "" + X;
			System.out.println(room);
		}
		scn.close();
	}

}
