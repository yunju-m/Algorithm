import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
        String[] s1, s2;
        String zeroStr = "CEFGHIJKLMNSTUVWXYZ";
        String oneStr = "ADOPQR";
        String twoStr = "B";
        
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            s1 = sc.next().split("");
            s2 = sc.next().split("");
            boolean isDiff = false;
            if (s1.length != s2.length) isDiff = true;
            for (int i = 0; i < s1.length; i++) {
            	if (isDiff) break;
            	if (zeroStr.contains(s1[i]) && zeroStr.contains(s2[i])) {
            		continue;
            	} else if (oneStr.contains(s1[i]) && oneStr.contains(s2[i])) {
            		continue;
            	} else if (twoStr.contains(s1[i]) && twoStr.contains(s2[i])) {
            		continue;
            	} else {
            		isDiff = true;
            	}
            }
            if (isDiff) {
            	System.out.println("#" +test_case + " " + "DIFF");
            } else {
            	System.out.println("#" + test_case + " " + "SAME");
            }
		}
	}
}