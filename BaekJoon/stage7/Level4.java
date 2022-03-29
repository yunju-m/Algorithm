package stage7;

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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());	// 낮에 올라가는 길이
		int B = Integer.parseInt(st.nextToken());	// 밤에 떨어지는 길이
		int V = Integer.parseInt(st.nextToken());	// 올라가야할 길이
		int count = (V - A) / (A - B);
		if ((V - A) % (A - B) == 0)
			count++;
		else
			count += 2;

		System.out.println(count);
		bw.flush();
		br.close();
		bw.close();
	}
}
