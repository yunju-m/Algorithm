import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int test_len = sc.nextInt();
			String str = sc.next();
			char[] arr = str.toCharArray();
			ArrayList<Character> g_arr = new ArrayList<>();
			boolean result = true;

			for (int i = 0; i < test_len; i++) {
				if (arr[i] ==  '(' || arr[i] ==  '{' || arr[i] ==  '[' || arr[i] ==  '<') {
					g_arr.add(arr[i]);
				} else {
					if (arr[i] == ')') {
						if (g_arr.contains('(')) g_arr.remove(Character.valueOf('('));
						else {
							result = false;
							break;
						}     		
					} else if (arr[i] == '}') {
						if (g_arr.contains('{')) g_arr.remove(Character.valueOf('{'));
						else {
							result = false;
							break;
						}
					} else if (arr[i] == ']') {
						if (g_arr.contains('[')) g_arr.remove(Character.valueOf('['));
						else {
							result = false;
							break;
						}
					}  else if (arr[i] == '>') {
						if (g_arr.contains('<')) g_arr.remove(Character.valueOf('<'));
						else {
							result = false;
							break;
						}
					}
				}
			}
			if (g_arr.size() == 0 && result)
				System.out.println("#" + test_case + " " + 1);
			else
				System.out.println("#" + test_case + " " + 0);
		}
		sc.close();
	}
}