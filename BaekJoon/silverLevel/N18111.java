package silverLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 마인크래프트
public class N18111 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N, M, B;					// B: 인벤토리의 블록의 수
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken()); 
		B = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		int min = 500, max = 1;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (min > arr[i][j])
					min = arr[i][j];
				else if (max < arr[i][j])
					max = arr[i][j];
			}
		}
		int resultTime = Integer.MAX_VALUE;
		int high = -1;

		for (int i = min; i <= max; i++) {
			int time = 0;
			int block = B;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					int dif = arr[j][k] - i;
					if (dif > 0) {
						time += Math.abs(dif) * 2;
						block += Math.abs(dif);
					} else if (dif < 0) {
						time += Math.abs(dif);
						block -= Math.abs(dif);
					}
				}
			}
			if (block < 0) continue;
			if (resultTime >= time) {
				resultTime = time;
				high = i;
			}
		}
		System.out.println(resultTime + " " + high);
	}

}
