import java.util.Scanner;
import java.util.HashMap;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();	
		while (T -- > 0) {
			HashMap<String, Integer> hm = new HashMap<>();	
			int N = in.nextInt();	
			while (N-- > 0) {
				in.next();	
				String kind = in.next();	
				if (hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind) + 1);
				} 
				else {
					hm.put(kind, 1);
				}
			}
			int result = 1;
			for (int val : hm.values()) {
				result *= (val + 1);
			}
			System.out.println(result - 1);
 
		}
	}
}