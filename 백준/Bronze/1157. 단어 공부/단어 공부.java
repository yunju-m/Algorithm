import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char[] c = new char[s.length()];
		int[] cnt = new int['z'-'a'+1];
		int max = 0, cMax = 0;
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);		// 문자열 분리
			// 문자열 비교 -> 같은 문자열에 해당하는 값 증가
			for (int j = 'a'; j <= 'z'; j++) {
				if(c[i] == (char)j) {
					cnt[j - 'a']++;
					break;
				}
			}

			for (int j = 'A'; j <= 'Z'; j++) {
				if(c[i] == (char)j) {
					cnt[j - 'A']++;
					break;
				}
			}
		}

		for (int k = 0; k <= 'z'-'a'; k++) {
			if (max < cnt[k]) {
				max = cnt[k];
				cMax = k;
				result = "";
			}
			else if(max == cnt[k])
				result = "?";
		}
		
		if(result != "?")
		System.out.println((char)(cMax + 65));
		else
			System.out.println(result);
		scn.close();
	}
}