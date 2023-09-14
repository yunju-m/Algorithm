import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = 10;
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int count = sc.nextInt();
            int SIZE = 100;
            int[] row_arr = new int[SIZE];
            int n, col_sum, row_sum, result = 0;
            int left_dig = 0, right_dig=0, max_dig;
 
            for (int i = 0; i < SIZE; i++) {
                col_sum = 0;
                for (int j = 0; j < SIZE; j++) {
                    n = sc.nextInt();
                    col_sum += n;
                    row_arr[j%100] += n;
                    if (i == j) left_dig += n;
                    if ( i+j==SIZE-1 ) right_dig += n;
                }  
                result = Math.max(result, col_sum);
            }
            Arrays.sort(row_arr);
            result = Math.max(result, row_arr[row_arr.length-1]);
            max_dig = Math.max(left_dig, right_dig);
            result = Math.max(result, max_dig);
            System.out.println("#" + count + " " + result);
        }
    }
}