import java.util.Scanner;

// 베르트랑 공준
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), sum = 0;
		int[] arr = new int[2*n+1];
		while (n >= 1) {
			arr = new int[2*n+1];
			arr[0] = arr[1] = 1;
			for (int i = 2; i <= 2*n; i++) {
				for (int j = 2; j*i <= 2*n; j++) {
					arr[i*j] = 1; 
				}
			}
			for (int i = n+1; i <= 2*n; i++) {
				if (arr[i] != 1)
					sum++;
			}
			System.out.println(sum);
			n = scn.nextInt();
			sum = 0;
		}
		scn.close();
	}
}