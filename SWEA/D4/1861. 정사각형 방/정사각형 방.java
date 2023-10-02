import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Solution
{
	static int n; 
    static int max; 
    static int maxNum;
    static int[][] arr;
    static int[] startMax; 
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static StringTokenizer st;
     
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
        
        for(int x = 1; x <= t; x++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n+2][n+2]; 
            startMax = new int[n * n + 1]; 
             
            for(int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 1; j <= n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
             
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    dfs(i,j,1,arr[i][j]);
                }
            }           
            max = 0;
            maxNum = 0;
            for(int i = startMax.length - 1; i > 0 ; i--) {
                if(startMax[i] >= max) {
                    max = startMax[i];
                    maxNum = i;
                }
            }
            System.out.println("#" + x + " " + maxNum + " " + max);
        }
    }
     
    public static void dfs(int x,int y,int count, int start) {
        int cur = arr[x][y];
 
        for(int i = 0; i < 4; i++) {
            int next = arr[x + dx[i]][y + dy[i]];
            if(next != 0 && next - cur == 1) {
                dfs(x + dx[i], y + dy[i], count + 1, start);
            }
        }
         
        if(count > startMax[start]) {
            startMax[start] = count;
        }
    }
}