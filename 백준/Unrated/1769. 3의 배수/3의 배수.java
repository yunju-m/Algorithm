import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X;
		int cnt = 0;
		
		X = br.readLine();
		while (true) {
			long Y = 0;
			if(X.length() == 1) break;
			for (int i = 0; i < X.length(); i++) {
				Y += Integer.parseInt(String.valueOf(X.charAt(i)));
			}
			cnt++;
			X = String.valueOf(Y);
		}
		
		System.out.println(cnt);
		if (Integer.parseInt(X) % 3 == 0) System.out.println("YES");
		else System.out.println("NO");
	}

}
