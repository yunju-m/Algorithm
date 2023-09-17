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
            int t_case, num1, num2, result = 0;
            t_case = sc.nextInt();
            num1 = sc.nextInt();
            num2 = sc.nextInt();
             
            result = squareFunc(num1, num2);
            System.out.println("#" + t_case + " " + result);
        }
        sc.close();
    }
     
    public static int squareFunc(int n1, int n2) {
        if (n2 == 0) return 1;
        else if (n2 < 2) return n1; 
        return n1 * squareFunc(n1, n2-1);
    }
}