import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 카드2
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		for (int i = 0; i < n-1; i++) {
			queue.remove();				// 맨 앞의 값 삭제
			int first = queue.peek();	// 첫 번째 숫자 선택	
			queue.add(first);			// 맨뒤로 추가
			queue.remove();				// 기존에 queue값은 삭제
		}
		System.out.println(queue.peek());
		scn.close();
	}

}
