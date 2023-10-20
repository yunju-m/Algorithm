import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, size = 10;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, total;
        String num;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                total = 0;
                num = sc.next();
                for (int j = 0; j < num.length(); j++) {
                    total += num.charAt(j) - '0'; 
                }
                if (total < min) min = total;
                if (total > max) max = total;
            }
            System.out.println("#" + test_case + " " + max + " " + min);
        }
        sc.close();
    }
}