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
			int num, str_count = 0;
			String str, sLine;
			ArrayList<Integer> str_index = new ArrayList<>();       
			num = sc.nextInt();
			str = sc.next(); 
			sLine = sc.next();

			if (sLine.contains(str)){
				for (int i = 0; i < sLine.length(); i++) {
					if (sLine.charAt(i) == str.charAt(0)) {
						str_index.add(i);
					}
				}
			}

			String target ="";
			for (int i = 0; i < str_index.size(); i++) {
				int sidx = Integer.valueOf(str_index.get(i).toString());
				if (sidx +str.length() <= sLine.length()) {
					target = sLine.substring(sidx, sidx +str.length());	
					if (target.equals(str)) str_count++; 
				}
			}         
			System.out.println("#" + num + " " + str_count);
		}		
		sc.close();
	}
}