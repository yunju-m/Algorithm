import java.util.Scanner;

// 삼각형 외우기
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();
		if (A == 60 && B == 60 && C == 60)
			System.out.println("Equilateral");
		else if ((A+B+C)==180 &&(A==B || B==C || A==C))
			System.out.println("Isosceles");
		else if ((A+B+C)==180 &&((A!=B) || (A!=C) || (B!=C)))
			System.out.println("Scalene");
		else 
			System.out.println("Error");
		scn.close();
	}

}
