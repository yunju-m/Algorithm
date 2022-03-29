package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Level5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) 
			bw.write(i + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
