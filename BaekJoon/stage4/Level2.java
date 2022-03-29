package stage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Level2 {
	public static void main(String[] args) throws IOException {
		int SIZE = 9;
		int MAX, count = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] value = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		MAX = value[0];
		for (int i = 0 ; i < SIZE; i++) {
			if(MAX < value[i]) {
				MAX = value[i];
				count = i+1;
			}
		}
		System.out.println(MAX);
		System.out.println(count);
		br.close();
	}
}
