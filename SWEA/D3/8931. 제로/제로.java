import java.util.Scanner;
import java.util.Stack;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, K, n;
		T=sc.nextInt();
        Stack<Integer> stack;
		for(int test_case = 1; test_case <= T; test_case++)
		{
            K = sc.nextInt();
            stack = new Stack<>();
            for (int i = 0; i < K; i++) {
            	n = sc.nextInt();
                if (n == 0 && !stack.isEmpty()) {
                    stack.pop();
                }else if (n == 0 && stack.isEmpty()) {
                	
                } else {
                    stack.add(n);
                } 
            }
            int result = 0;
            for (int i = 0; i < stack.size(); i++) {
            	result += stack.get(i);
            }
            System.out.println("#" + test_case + " " + result);
		}
	}
}