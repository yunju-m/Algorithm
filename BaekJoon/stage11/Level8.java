package stage11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 정렬
public class Level8 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		boolean[] mul = new boolean[N];
		String[] s = new String[N];
		for (int i = 0; i < N; i++) {
			s[i] = br.readLine();
		}

		for (int i = 0; i < N; i++) {
			mul[i] = false;
			for (int j = i+1; j < N; j++) {
				if (s[i].length() > s[j].length()) {
					String cnt = s[i];
					s[i] = s[j];
					s[j] = cnt;
					mul[i] = false;
				}
				else if (s[i].length()==s[j].length()) {
					if(s[i].compareTo(s[j]) > 0) {
						String cnt = s[i];
						s[i] = s[j];
						s[j] = cnt;
						mul[i] = false;
					} else if (s[i].compareTo(s[j]) == 0) {
						mul[i] = true;
					}
				}
			}
		}

		for (int i = 0; i < N; i++) {
			if (mul[i] != true) {
				sb.append(s[i]+"\n");
			}
		}
		System.out.println(sb);
	}
}
