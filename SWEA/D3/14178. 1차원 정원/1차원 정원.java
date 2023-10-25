import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T, n, d, x, cnt;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            n = sc.nextInt();
            d = sc.nextInt();
            cnt = 0;
            x = d+1;
            while (true) {
                cnt++;
                if (x+d < n) {
                    x = x+d+d+1;
                } else {
                    break;
                    }
            }
            System.out.println("#" + test_case + " " + cnt);
        }
    }
}