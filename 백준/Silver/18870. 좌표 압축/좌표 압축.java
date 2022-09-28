import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// 좌표 압축
// 입력받은 수에서 작은 수가 몇개인지 각각 출력하는 문제
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = scn.nextInt();
		HashMap<Integer, Integer> hm = new HashMap<>();
		int[] arr = new int[N];
		int[] srr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
			srr[i] = arr[i];
		}
		Arrays.sort(srr);

		int cnt = 0;
		for (int value : srr) {
			if (!hm.containsKey(value)) {
				hm.put(value, cnt);
				cnt++;
			}
		}

		for (int i = 0; i < N; i++) {
			sb.append(hm.get(arr[i])).append(" ");
		}
		System.out.println(sb);
		scn.close();
	}
}
