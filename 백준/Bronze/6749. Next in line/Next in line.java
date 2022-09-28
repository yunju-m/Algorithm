import java.util.Scanner;

// 나이 많은 아이 찾기 (Next in line)
public class Main {
	public static void main(String[] args) {	
		Scanner scn = new Scanner(System.in);
		int yage = scn.nextInt();
		int mage = scn.nextInt();
		int oage = mage-yage+mage;
		System.out.println(oage);
		scn.close();
	}

}
