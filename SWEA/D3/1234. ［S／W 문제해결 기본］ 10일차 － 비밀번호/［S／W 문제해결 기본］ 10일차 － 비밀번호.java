import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Stack;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			int arr_size = sc.nextInt();
			String[] arr = sc.next().split("");
			Stack<Integer> stack = new Stack<>();
			int n;
			for (int i = 0; i < arr_size; i++) {
				n = Integer.parseInt(arr[i]);
				if (stack.size()== 0 || stack.peek() != n) {
					stack.push(n);
				} else if (stack.peek() == n) {
					stack.pop();
				}
			}
			System.out.print("#" + test_case + " ");
			for (int i = 0; i < stack.size(); i++) {
				System.out.print(stack.get(i));
			}
			System.out.println();
		}
		sc.close();
	}
}