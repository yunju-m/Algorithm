package bronzeLevel;

import java.util.Scanner; 
public class N2443 { 	
	public static void main(String[] args) { 	
		Scanner scn = new Scanner(System.in); 	
		final int N = scn.nextInt(); 		
		for(int i = N-1; i >= 0 ; i--) { 
			for(int j = 1; j < N-i; j++) 
				System.out.print(" "); 	
			for(int j = 0; j < i*2+1; j++)
				System.out.print("*"); 	
			System.out.println(); 	
		}
		scn.close();
	} 
}