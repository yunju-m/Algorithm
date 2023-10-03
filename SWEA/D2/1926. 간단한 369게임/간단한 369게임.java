import java.util.Scanner;
import java.io.FileInputStream;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        String num; 
        char temp; 
        int cnt = 0; 
        for (int i = 1; i <= N; i++) {
            num = Integer.toString(i);
            for (int j = 0; j < num.length(); j++) {
                temp = num.charAt(j);
                if ((int) temp % 3 == 0 && temp != '0') { 
                    cnt++;
                }
            }
            if (cnt > 0) { 
                while (cnt > 0) { 
                    sb.append('-');
                    cnt--;
                }
            } else { 
                sb.append(num);
            }
            sb.append(' ');
        }
        System.out.println(sb);
    }
}