package stage11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// 나이순 정렬
// 안정 알고리즘을 이용하여 나이가 증가하는 순으로 나열한다.
// 나이가 같으면 먼저 가입한 사람순서대로 나열한다.
public class Level9 {
	public static void main(String[] args) throws IOException{
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		String[][] s = new String[N][N];

		for (int i = 0; i < N; i++) {
			s[i][0] = scn.next();
			s[i][1] = scn.next();
		}

		Arrays.sort(s, (e1, e2)->{
			if (Integer.parseInt(e1[0]) > Integer.parseInt(e2[0])) {
				return Integer.parseInt(e2[0]) - Integer.parseInt(e1[0]);
			} else {
				return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]); 
			}
		});

		for (int i = 0; i < N; i++) {
			System.out.println(s[i][0]+" "+s[i][1]);
		}
		scn.close();
	}
}
