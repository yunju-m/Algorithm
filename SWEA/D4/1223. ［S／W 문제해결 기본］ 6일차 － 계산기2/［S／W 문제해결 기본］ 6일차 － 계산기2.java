import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int str_len = sc.nextInt();
			String str = sc.next();
			String[] add_str = str.split("\\+");

			int result = 0;
			for (String a_str : add_str){
				if (a_str.contains("*")) {
					String[] mul_str = a_str.split("\\*");
					int mulsum = 1;
					for (String m_str : mul_str)
						mulsum *= Integer.parseInt(m_str);
					result += mulsum;
				}
				else result += Integer.parseInt(a_str);
			}
			System.out.println("#" + test_case + " " + result);
		}
		sc.close();
    }
}