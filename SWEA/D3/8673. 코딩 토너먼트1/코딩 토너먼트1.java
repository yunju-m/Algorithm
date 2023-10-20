import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, k, size, result;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            k = sc.nextInt();
            Stack<Integer> stack = new Stack<>();
            Stack<Integer> win_stack = new Stack<>();;
            size = (int) Math.pow(2, k);
            result = 0;
            
            for (int i = 0; i < size; i++){
                stack.push(sc.nextInt());
            }
            int p1, p2;
            while(true) {
            	if (win_stack.size() == 1) break;
            	if (stack.empty()) {
            		stack = win_stack;
            		win_stack = new Stack<>();
            		size = stack.size();
            	}
            	for (int i = 0; i < size/2; i++) {
            		p1 = stack.pop();
                	p2 = stack.pop();
                	result += Math.abs(p1 - p2);
                	if (p1 > p2) win_stack.push(p1);
                	else win_stack.push(p2);
            	}
            }
            System.out.println("#" + test_case + " " + result);
		}
		sc.close();
	}
}