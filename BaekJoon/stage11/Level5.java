package stage11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 소트인사이트 (숫자 정렬 문제)
public class Level5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[10];
		int index = 0;
		while(N!=0) {
			arr[index] = N%10;
			N = N/10;
			index++;
		}
		Arrays.sort(arr);
		for (int i = 9; i >= 10-index; i--) {
			sb.append(arr[i]);
		}
		System.out.print(sb);
	}

}
