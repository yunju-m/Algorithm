import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		String[] arr, resultArr;
		HashSet<String> hashSet;
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			arr = br.readLine().split(""); 
			hashSet = new HashSet<>(Arrays.asList(arr));
			resultArr = hashSet.toArray(new String[0]);
			System.out.println("#" + tc + " " + resultArr.length);
		}
	}
}