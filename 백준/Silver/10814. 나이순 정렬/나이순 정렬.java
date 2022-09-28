import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 나이순 정렬
// 안정 알고리즘을 이용하여 나이가 증가하는 순으로 나열한다.
// 나이가 같으면 먼저 가입한 사람순서대로 나열한다.
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		String[][] s = new String[N][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			s[i][0] = st.nextToken();
			s[i][1] = st.nextToken();
		}

	
		Arrays.sort(s, (e1, e2)->{
			 return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(s[i][0] + " " + s[i][1]);
		}
	}
}
