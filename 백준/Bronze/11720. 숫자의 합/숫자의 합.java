import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		String s = scn.next();
		char[] c = new char[size];
		int n, sum = 0;
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			c[i] = s.charAt(i);
			n = (int)c[i] -48;
			arr[i] = n % 10;
			n = n / 10;
			sum += arr[i];
		}
		System.out.println(sum);
		scn.close();
	}
}