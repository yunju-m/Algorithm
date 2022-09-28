import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = sc.nextInt();
		int i, j, k;
		for(i = num; i > 0; i--) {
			for(j = 1; j < i; j++) {
				bw.write(" ");
			}
			for(k = j; k <= num; k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		sc.close();
	}
}