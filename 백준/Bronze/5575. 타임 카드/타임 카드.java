import java.util.Scanner;

// 타임카드
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H,M,S,h,m,s;
		for (int i = 0; i < 3; i++) {
			H = scn.nextInt();
			M = scn.nextInt();
			S = scn.nextInt();
			h = scn.nextInt();
			m = scn.nextInt();
			s = scn.nextInt();
			if (s-S < 0) {
				m--;
				s += 60-S;
			} else s = s-S;
			if (m-M < 0) {
				h--;
				m += 60-M;
			}else m = m-M;
			h = h-H;
			System.out.println(h +" " + m +" "+s);
		}
		scn.close();
	}

}
