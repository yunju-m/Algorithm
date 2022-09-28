import java.util.Scanner;
public class Main {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int H, M;
		H = scanner.nextInt();
		M = scanner.nextInt();
		if ( M - 45 < 0) {
			H = H -1;
			if (H < 0)
				H = 23;
			M = 60 - (45 - M);
		}
        else
            M = M - 45;
		System.out.println(H + " "+ M);
		scanner.close();
	}
}