package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Level4 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		int num = Integer.parseInt(br.readLine());
		int A, B;

		StringTokenizer st;
		for(int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			bw.write(A+B + "\n");	// 출력
		}
		bw.flush();			// 남아있는 데이터를 모두 출력
		br.close();			// 스트림을 닫는다.
		bw.close();
	}
}
