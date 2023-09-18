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
			int sq_len = sc.nextInt();
			int[][] table = new int[sq_len][sq_len];
			for (int i = 0; i < sq_len; i++) {
				for (int j = 0; j < sq_len; j++) {
					table[i][j] = sc.nextInt();
				}
			}

			int result = 0;
			for (int i = 0; i < sq_len; i++) {
				ArrayList<Integer> NS_list = new ArrayList<>();
				for (int j = 0; j < sq_len; j++) {
					if (table[j][i] == 1 || table[j][i] == 2) {
						NS_list.add(table[j][i]);
					}
				}
				for (int k = 1; k < NS_list.size(); k++) {
					String str = Integer.toString(NS_list.get(k-1)) + Integer.toString(NS_list.get(k));
					if(str.equals("12")) {
						result += 1;
						k++;
					}
				}
			}
			System.out.println("#" + test_case + " " + result);
		}
		sc.close();
	}
}