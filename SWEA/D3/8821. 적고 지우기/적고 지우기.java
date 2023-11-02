import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] s;
		List<String> arr = new ArrayList<>();
		
		for (int tc = 1; tc <= T; tc++) {
			s = sc.next().split("");
			arr = new ArrayList<>();
			for (int i = 0; i < s.length; i++) {
				if(arr.contains(s[i])) {
					arr.remove(s[i]);
				} else {
					arr.add(s[i]);
				}
			}
			System.out.println("#" + tc + " " + arr.size());
		}
		sc.close();
	}
}