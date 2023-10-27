import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner scan = new Scanner(System.in);		
		int T = scan.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = scan.nextInt();
			int[] seats = new int[N];
			for(int i=0; i<seats.length; i++) {
				seats[i] = scan.nextInt();
			}
			Arrays.sort(seats);
			int minSeats = N;	
			for(int i=0; i<seats.length; i++) {
				minSeats += seats[i];
			}
			minSeats += seats[seats.length-1];	
			System.out.println("#" + tc + " " + minSeats);	
		}
		scan.close();
	}
}