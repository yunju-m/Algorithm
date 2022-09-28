public class Main {

	public static void main(String[] args) {
		boolean[] flag = new boolean[10001];	
		for (int i = 0; i < flag.length; i++) {
			int num = d(i);
			if (num < 10001)
				flag[num] = true;
		}
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == false)
				System.out.println(i);
		}
	}

	public static int d(int n) {
		int sum = n;
		while(true) {
			sum += n % 10;
			n = n / 10;
			if (n == 0)
				break;
		}	
		return sum;
	}
}