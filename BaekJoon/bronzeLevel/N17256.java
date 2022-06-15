package bronzeLevel;

import java.util.Scanner;

// 달달함이 넘쳐흘러
public class N17256 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ax = scn.nextInt(), ay = scn.nextInt(), az = scn.nextInt();
		int cx = scn.nextInt(), cy = scn.nextInt(), cz = scn.nextInt();
		int bx, by, bz;
		bx = cx-az;
		by = cy/ay;
		bz = cz-ax;
		System.out.println(bx+" "+by+" "+bz);
		scn.close();
	}

}
