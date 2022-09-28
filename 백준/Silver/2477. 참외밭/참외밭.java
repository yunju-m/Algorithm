import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 참외밭
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int max = 0;
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		st.nextToken();		// 방향
		int a = Integer.parseInt(st.nextToken());	// 첫 번째 변
		int before = a;
		
		for (int i = 1; i < 6; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();	// 방향
			int now = Integer.parseInt(st.nextToken());
			max = Math.max(now*before, max);
			sum += now*before;
			before = now;
		}
		sum += a*before;
		max = Math.max(a*before, max);
		int result = (max - (3*max-sum)) * K;
		System.out.println(result);
	}

}
