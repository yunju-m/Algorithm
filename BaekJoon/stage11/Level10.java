package stage11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

// 좌표 압축
// 입력받은 수에서 작은 수가 몇개인지 각각 출력하는 문제
public class Level10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			a.add(scn.nextInt());
		}
		// 중복값 제거
		HashSet<Integer> arr2 = new HashSet<Integer>(a);
		ArrayList<Integer> a2 = new ArrayList<>(arr2);
		Collections.sort(a2);
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < a2.size(); j++) {
				if (a.get(i) == a2.get(j)) {
					a.add(i, j);
					a.remove(i+1);
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(a.get(i) + " ");
		}
		scn.close();
	}

}
