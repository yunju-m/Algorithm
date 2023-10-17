import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int h, w, n;

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			char[][] map = new char[h][w];
			int x=0, y=0, dir = 0;

			for (int i = 0; i < h; i++) {
				String line = br.readLine();
				for (int j=0; j < w; j++) {
					map[i][j] = line.charAt(j);
					if (map[i][j] == '<' || map[i][j] == '>' 
							|| map[i][j] == '^' || map[i][j] == 'v') {
						x = i;
						y = j;
					}
					switch(map[i][j]) {
					// 상
					case '^':
						dir = 1;
						break;
						// 하
					case 'v':
						dir = 2;
						break;
						// 좌
					case '<':
						dir = 3;
						break;
						// 우
					case '>':
						dir = 4;
						break;
					}
				}
			}

			n = Integer.parseInt(br.readLine());
			String[] action = br.readLine().split("");

			for (int i = 0; i < n; i++) {
				int idx = 0;
				switch(action[i]) {
				// 상
				case "U":
					dir = 1;
					map[x][y] = '^';
					if (x > 0 && map[x-1][y] == '.') {
						map[x-1][y] = map[x][y];
						map[x][y] = '.';
						x -= 1;
					}
					break;
					// 하
				case "D":
					dir = 2;
					map[x][y] = 'v';
					if (x < h-1 && map[x+1][y] == '.') {
						map[x+1][y] = map[x][y];
						map[x][y] = '.';
						x += 1;
					}
					break;
					// 좌
				case "L":
					dir = 3;
					map[x][y] ='<';
					if (y > 0 && map[x][y-1] == '.') {
						map[x][y-1] = map[x][y];
						map[x][y] = '.';
						y -= 1;
					}
					break;
					// 우
				case "R":
					dir = 4;
					map[x][y] = '>';
					if (y < w-1 && map[x][y+1] == '.') {
						map[x][y+1] = map[x][y];
						map[x][y] = '.';
						y += 1;
					}
					break;
					// 발사
				case "S":
					switch(dir) {
					// 위쪽
					case 1:
						idx = x;
						while (true) {
							if (idx-1 < 0 || map[idx-1][y] == '#') break;
							if (map[idx-1][y] == '*') {
								map[idx-1][y] = '.';
								break;
							}
							idx--;
						}
						break;
						// 아래쪽
					case 2:
						idx = x;
						while (true) {
							if (idx+1 >= h || map[idx+1][y] == '#') break;
							if (map[idx+1][y] == '*') {
								map[idx+1][y] = '.';
								break;
							}
							idx++;
						}
						break;

						// 왼쪽
					case 3:
						idx = y;
						while (true) {
							if (idx-1 < 0 || map[x][idx-1] == '#') break;
							if (map[x][idx-1] == '*') {
								map[x][idx-1] = '.';
								break;
							}
							idx--;
						}
						break;
						// 오른쪽
					case 4:
						idx = y;
						while (true) {
							if (idx+1 >= w || map[x][idx+1] == '#') break;
							if (map[x][idx+1] == '*') {
								map[x][idx+1] = '.';
								break;
							}
							idx++;
						}
						break;
					}
					break;
				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}
}
