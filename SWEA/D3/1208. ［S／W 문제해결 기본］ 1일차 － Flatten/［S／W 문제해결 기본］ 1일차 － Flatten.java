import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        int col = 100;
     
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int dump = sc.nextInt();
            int[] box = new int[col];
            for (int i = 0; i < col; i++) {
                box[i] = sc.nextInt();
            }
             
            Arrays.sort(box);          
            for (int i = 0; i < dump; i++) {
                if ( box[0] == box[col-1] || box[0]+1 == box[col-1]) break;
                box[col-1]--;
                box[0]++;
                Arrays.sort(box);
            }
            System.out.println("#" + test_case + " "  + (box[col-1]-box[0]));
        }
    }
}