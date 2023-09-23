import java.util.Scanner;
import java.io.FileInputStream;
import java.util.LinkedList;
  
class Solution
{
    public static void main(String args[]) throws Exception
    {
      Scanner sc = new Scanner(System.in);
		for(int t = 1; t <= 10; t++) {
			int n = sc.nextInt();
			LinkedList <Integer> l = new LinkedList<>();
			for(int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				l.add(tmp);
			}
			int c = sc.nextInt();
			for(int i = 0; i < c; i++) {
				String s = sc.next();
				if(s.equals("I")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					int[] a = new int[y];
					for(int j = 0; j < y; j++) {
						a[j] = sc.nextInt();
					}
					
					for(int j = y-1; j >= 0; j--) {
						l.add(x, a[j]);
					}
				}
				else if(s.equals("D")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					for(int j = 0; j < y; j++) {
						l.remove(x);
					}
				}
				else if(s.equals("A")) {
					int y = sc.nextInt();
					int[] a = new int[y];
					for(int j = 0; j < y; j++) {
						a[j] = sc.nextInt();
					}
					
					for(int j = y-1; j >= 0; j--) {
						l.addLast(a[j]);
					}
				}
			}
			System.out.print("#" + t + " ");
			for(int i = 0; i < 10; i++) {
				System.out.print(l.get(i) + " ");
			}
			System.out.println();
		}
    }
}