import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		long total;
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		total = sum(arr);
		System.out.println(total);
		scanner.close();
	}
	
	public static long sum(int[] a) {
		long ans = 0;
		for(int i = 0; i < a.length; i++) 
			ans += a[i];
		return ans;
	}
}