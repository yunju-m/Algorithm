import java.util.Scanner;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] str;
        sc.nextLine();  // 개행문자 제외
        for(int test_case = 1; test_case <= T; test_case++)
        {
            String result = "";
            str = sc.nextLine().split(" ");
            for (int i = 0; i < str.length; i++) {
                result += str[i].charAt(0);
            }
            System.out.println("#" + test_case + " " + result.toUpperCase());
        }
        sc.close();
    }
}