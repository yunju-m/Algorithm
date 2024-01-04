import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public int solution(String[][] clothes) {
		HashMap<String, Integer> clothes_combi = new HashMap<>();
		for (int i = 0; i < clothes.length; i++){
			if (!clothes_combi.containsKey(clothes[i][1])) {
				clothes_combi.put(clothes[i][1], 1);
			}
			else {
				clothes_combi.replace(clothes[i][1], clothes_combi.get(clothes[i][1]) + 1);
			}
		}
        
		int total = 1;
		for (Entry<String, Integer> entrySet : clothes_combi.entrySet()) {
			total *= entrySet.getValue()+1;
		}
        
        return total-1;
    }
}