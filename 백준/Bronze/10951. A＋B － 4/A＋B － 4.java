import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = 5, B = 5;
		StringTokenizer st;
		while(A != 0 && B != 0) {
			try {
				st = new StringTokenizer(br.readLine(), " ");
				A = Integer.parseInt(st.nextToken());
				B = Integer.parseInt(st.nextToken());
				bw.write(A+B+"\n");
				bw.flush();
			} catch (Exception e) {
				break;
			}
		}
		bw.close();
		br.close();
	}
}