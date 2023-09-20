import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Solution
{
	static int l; // 테스트 케이스 길이
	static String str; // 계산식 (중위 표기법)
	static String postfix; // 변환식 (후위 표기법)
	static Stack<Character> stack; // 변환 위한 스택
	static Stack<Integer> calStack; // 변환식 계산 스택
	static int resultValue; // 계산 결과

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int t = 1; t <= 10; t++) {
			stack = new Stack<>();
			calStack = new Stack<>();
			postfix = "";
			resultValue = 0;

			l = Integer.parseInt(br.readLine());
			str = br.readLine();

			// 현재 문자 변환
			for(int i = 0; i < l; i++) {
				conversion(str.charAt(i)); 
			}

			// 스택이 빌 때 까지 변환식에 넣음
			while(!stack.isEmpty()) {
				postfix += stack.pop();
			}

			// 후위 표기식 계산
			for(int i = 0; i < postfix.length(); i++) {
				calculate(postfix.charAt(i));
			}

			resultValue = calStack.pop();
			System.out.println("#" + t + " " + resultValue);
		}
	}

	public static void conversion(char cur) {
		// '(' => 무조건 stack 에 쌓음
		if(cur == '(') {
			stack.push(cur);
		}
		// ')' => '(' 만날때 까지 stack의 내용 pop 하여 변환식에 넣음, '(' 는 버림
		else if(cur == ')') {
			while(!stack.isEmpty()) {
				if(stack.peek() == '(') {
					stack.pop();
					break;
				}
				else {
					postfix += stack.pop();
				}
			}
		}
		// '*' => 무조건 stack 에 쌓음 (*보다 우선순위인 연산자가 없음)
		else if(cur == '*') {
			stack.push(cur);
		}
		// '+' => 비어 있다면 stack 에 쌓음, 비어있지 않다면 '(' 만날때 까지 stack pop 하여 변환식에 넣음
		else if(cur == '+') {
			if(stack.isEmpty()) {
				stack.push(cur);
			}
			else{
				while(!stack.isEmpty()) {
					if(stack.peek() == '(') {
						stack.push(cur);
						break;
					}
					else {
						postfix += stack.pop();
					}
				}
			}
		}
		// 피연산자일 때 => 변환식에 넣음
		else {
			postfix += cur;
		}	
	}

	// 연산자가 아니라면 stack 에 넣음, 연산자면 스택 2개 pop 후 계산 후 다시 push 
	public static void calculate(char cur) {	
		if(cur == '*') {
			int tmp = calStack.pop() * calStack.pop();
			calStack.push(tmp);
		}
		else if(cur == '+') {
			int tmp = calStack.pop() + calStack.pop();
			calStack.push(tmp);
		}
		else {
			calStack.push(cur - '0');
		}
	}
}