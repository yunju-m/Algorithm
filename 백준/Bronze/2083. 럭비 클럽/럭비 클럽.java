import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 럭비 클럽
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String s; int age, weight;
		while (true) {
			st = new StringTokenizer(br.readLine(), " ");
			s = st.nextToken();
			if (s.equals("#")) break;
			else {
				age = Integer.parseInt(st.nextToken());
				weight = Integer.parseInt(st.nextToken());
				if (age > 17 || weight >= 80) 
					sb.append(s +" " + "Senior").append('\n');
				else sb.append(s + " " + "Junior").append('\n');
			}
		}
		System.out.println(sb);
	}

}
