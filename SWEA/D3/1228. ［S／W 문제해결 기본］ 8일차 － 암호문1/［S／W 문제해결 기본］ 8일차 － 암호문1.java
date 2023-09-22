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
            int pwd_num = sc.nextInt();
            ArrayList<Integer> orgin_pwd = new ArrayList<>();
            for (int i = 0; i < pwd_num; i++) {
            	orgin_pwd.add(sc.nextInt());
            }           
            int cmd_num = sc.nextInt();
            for (int cn = 0; cn < cmd_num; cn++) {
                String c = sc.next();	// 구분자 
                int x = sc.nextInt();
                int y = sc.nextInt();
                int[] s = new int[y];
                for (int i = 0; i < y; i++){
                	orgin_pwd.add(x+i, sc.nextInt());
                }
            }
            System.out.print("#" + test_case + " ");
            for (int i = 0; i < 10; i++) {
            	System.out.print(orgin_pwd.get(i) + " ");
            }
		}
		sc.close();
	}
}