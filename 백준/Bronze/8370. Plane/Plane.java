import java.util.Scanner;

// Plane
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int k1 = scn.nextInt();
		int n2 = scn.nextInt();
		int k2 = scn.nextInt();
		int sum = n1*k1+n2*k2;
		System.out.println(sum);
		
		scn.close();
	}

}
