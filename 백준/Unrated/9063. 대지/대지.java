import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N, x, y;
		int maX=-10000, maY=-10000, miX=100000, miY=100000;
		
		N= Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			maX = Math.max(maX, x);
			maY = Math.max(maY, y);
			miX = Math.min(miX, x);
			miY = Math.min(miY, y);
		}
		System.out.println(Math.abs((maX-miX)*(maY-miY)));
	}
}
