package stage7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st2 = br.readLine();

		/*
		StringTokenizer st = new StringTokenizer(s , "=, -");
		String st2 = "";
		int size = st.countTokens();

		for (int i = 0; i < size; i++) {
			st2 += (String) st.nextElement();
		}
		 */
		int result = st2.length();

		for (int i = 0; i < st2.length() - 1; i++) {
			if (st2.contains("lj") || st2.contains("nj")) {
				if ((st2.charAt(i) == 'l') || (st2.charAt(i) == 'n')) {
					if (st2.charAt(i+1) == 'j')
						result--;
				}
			}

			if (st2.contains("dz=")) {
				if (st2.charAt(i) == 'd')
					if (st2.charAt(i+1) == 'z')
						if (st2.charAt(i+2) == '=')
							result--;
			}
			if (st2.contains("=") || st2.contains("-")) {
				if ((st2.charAt(i) == 'c') || (st2.charAt(i) == 's') || (st2.charAt(i) == 'z')) {
					if ((st2.charAt(i+1) == '='))
						result--;
				}
				if ((st2.charAt(i) == 'c') || st2.charAt(i) == 'd')
					if ((st2.charAt(i+1) == '-'))
						result--;
			}
		}
		System.out.println(result);
	}
}
