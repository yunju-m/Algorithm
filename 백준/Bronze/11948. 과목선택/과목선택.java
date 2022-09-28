import java.util.Scanner;

// 과목선택
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[6];
		int min = 100;
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			arr[i] = scn.nextInt();
			sum += arr[i];
			min = Math.min(arr[i], min);
		}
		sum -= min;
        min = 100;
		for (int i = 0; i < 2; i++) {
			arr[i] = scn.nextInt();
			sum += arr[i];
			min = Math.min(arr[i], min);
		}
		sum -= min;
		System.out.println(sum);
		scn.close();
	}

}
