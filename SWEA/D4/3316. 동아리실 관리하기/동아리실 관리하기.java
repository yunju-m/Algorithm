import java.util.Scanner;
 
public class Solution {
    public static int[][] res;
    public static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            String masters = sc.next();
            res = new int[masters.length()][16];
            ans = 0;
            sol(masters);
            System.out.println("#"+tc+" "+ans);
        }
    }
    public static void sol(String masters) {
        for(int k = 0; k < masters.length(); k++) {     
            int master = 1 << (masters.charAt(k) - 'A');
            for(int i = 1; i < 16; i ++) {
                if(k == 0) {
                    if((i&master) != 0 && (i&1) != 0) {
                        res[k][i] = 1;
                    }
                }else {
                    if(res[k-1][i] != 0) {
                        for(int j = 1; j < 16;j++) {
                            if((i&j)!=0 && (j&master)!=0) {
                                res[k][j] =(res[k][j] + res[k-1][i]) % 1000000007;
                            }
                        }
                    }
                }
            }  
        }
       for(int i = 1; i < 16; ++i) {
            ans =(ans+res[masters.length()-1][i]) % 1000000007;
        }   
    }
}