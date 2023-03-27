import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr = new int[3];
		boolean end = false;
		while(true) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if (i > 0 && arr[i] == 0 && arr[i-1] == arr[i]) end = true;
			}
			if (end == true) break;
			Arrays.sort(arr);
			if (arr[2] >= arr[0]+arr[1])
				System.out.println("Invalid");
			else {
				if (arr[0]==arr[1] && arr[1]==arr[2]) System.out.println("Equilateral");
				else if (arr[0]==arr[1] || arr[1]==arr[2]) System.out.println("Isosceles");
				else System.out.println("Scalene");
			}
			
		}
	}

}
